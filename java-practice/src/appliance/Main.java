package appliance;

public class Main {

    public static void main(String[] args) {
        Fridge fridge01 = new Fridge("冷蔵庫","ブランド",10000,1000);
        fridge01.getInfo();
        Tv tv01 = new Tv("Tv01","ブランド",10000,45,"無");
        tv01.getInfo();

    }

}
