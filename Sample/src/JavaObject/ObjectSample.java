package JavaObject;

public class ObjectSample {
    public static void main(String[] args){
        Employee emp01 = new Employee();
        emp01.employeeName = "大島";
        emp01.divisionName = "営業部";
        emp01.vitality = 150;
        emp01.greeting();
        emp01.introduce();
        emp01.report();
        emp01.showVitality();

        Employee emp02 = new Employee();
        emp02.employeeName ="原川";
        emp02.divisionName ="営業部";
        emp02.vitality=250;
        emp02.introduce();
        emp02.greeting();
        emp02.report();
        emp02.showVitality();
     }

}
