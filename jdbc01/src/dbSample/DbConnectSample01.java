package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnectSample01 {

    public static void main(String[] args) {

        //データベース接続と結果取得のための変数
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1.ドライバのクラスをJava上で読み込む
            Class.forName("com.mysql.jdbc.Driver");
            //2.DBと接続する
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/world?useSSL=false",
                    "root",
                    "Kalmen34@"
                );
            //3.DBとやりとりする窓口（Statementオブジェクト）の作成
            stmt = con.createStatement();
            //4,5. Select文の実行と結果を格納/代入
            String sql = "select * from country limit 50";
            rs = stmt.executeQuery(sql);
            //6.結果を表示する
            while(rs.next()){
                String name = rs.getString("Name");
                System.out.println(name);
            }
            //7.接続を閉じる
        } catch (ClassNotFoundException e) {
            System.err.println("jDBCのドライバのロードに失敗しました。");;
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }finally {
            // 7. 接続を閉じる
            if( rs != null ){
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.err.println("ResultSetを閉じるときにエラーが発生しました。");
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try{
                    stmt.close();
                }
                catch(SQLException e){
                    System.out.println("Statementを閉じるときにエラーが発生しました");
                    e.printStackTrace();
                }
            }
            if( con != null ){
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("データベース切断時にエラーが発生しました。");
                    e.printStackTrace();
                }
            }
        }
    }

}
