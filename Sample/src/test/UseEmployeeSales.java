package test;

public class UseEmployeeSales {
    public static void main(String[] args) {
        EmployeeSales sales = new EmployeeSales(10, "南野", 200);
        // 子クラスのフィールドに値をセット
        sales.setAppointment("ほげほげ商事株式会社");

        // 親クラスのメソッドも使えます
        sales.introduce();

        // 親クラスのメソッドも使えます
        sales.greeting();

        // 子クラス独自のメソッドも使えます
        sales.report();

        // 体力表示
        sales.showVitality();
    }

}
