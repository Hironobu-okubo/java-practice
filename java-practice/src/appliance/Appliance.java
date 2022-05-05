package appliance;

public class Appliance {

    private String name;
    private String brand;
    private int price;

    public Appliance(String name, String brand, int price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getInfo(){
        System.out.println("商品名は" + name + "です。");
        System.out.println("ブランドは" + brand + "です。");
        System.out.println("値段は" + price + "円です。");

    }

}
