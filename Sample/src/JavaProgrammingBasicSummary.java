
public class JavaProgrammingBasicSummary {

    public static void main(String[] args) {
        add(45,13);

        double result = add(12.3,4.8);
        System.out.println(result);

    }

    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

}
