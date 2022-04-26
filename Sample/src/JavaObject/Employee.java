package JavaObject;

public class Employee {

    //フィールド
    public String employeeName;
    public String divisionName;

    //自己紹介メソッド
    public void introduce(){
        System.out.println("私の名前は" + employeeName);
        System.out.println("私の所属は" + divisionName);
    }
}
