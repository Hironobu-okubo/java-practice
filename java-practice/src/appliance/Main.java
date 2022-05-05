package appliance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<Appliance> inputList = new ArrayList<Appliance>();
        Fridge fridge01 = new Fridge("冷蔵庫","ブランド",10000,1000);
        inputList.add(fridge01);
        Tv tv01 = new Tv("Tv01","ブランド",10000,45,"無");
        inputList.add(tv01);

        Scanner scanner = new Scanner(System.in);
        System.out.println("最低価格を入力してください。");
        int inputMin = scanner.nextInt();
        System.out.println("最高価格を入力してください。");
        int inputMax = scanner.nextInt();
        scanner.close();

        ArrayList<Appliance> outputList = checkPrice(inputMin,inputMax,inputList);
        for(Appliance app:outputList){
            app.getInfo();
        }



    }

    public static ArrayList<Appliance> checkPrice(int inputMin, int inputMax, ArrayList<Appliance> inputList){
        ArrayList<Appliance> outputList = new ArrayList<Appliance>();
        for(Appliance app:inputList){
            if(app.getPrice() <= inputMax && app.getPrice() >= inputMin){
                outputList.add(app);
            }
        }
        return outputList;
    }

}
