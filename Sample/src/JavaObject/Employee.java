package JavaObject;

public class Employee {

    //フィールド
    public String employeeName;
    public String divisionName;
    public int vitality;

    //自己紹介メソッド
    public void introduce(){
        System.out.println("私の名前は" + employeeName);
        System.out.println("私の所属は" + divisionName);
    }

    public void greeting(){
        vitality -= 10;
        System.out.println("おはようございます");
    }
    public void report(){
        vitality -= 10;
        System.out.println("今日は10件アポイント取りました");
    }
    public void showVitality(){
        vitality -= 10;
        System.out.println("残り体力は" + vitality);
    }
}
