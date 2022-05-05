package appliance;

public class Tv extends Appliance {

    private int size;
    private String hasWifi;

    public Tv(){

    }

    public Tv(String name, String brand, int price, int size, String hasWifi){
        super.setName(name);
        super.setBrand(brand);
        super.setPrice(price);
        this.size = size;
        this.hasWifi = hasWifi;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(String hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("サイズは" + size +"です。");
        System.out.println("WiFi機能は" + hasWifi + "です。");
        System.out.println("");
    }

}
