package appliance;

public class Fridge extends Appliance{

    private int capacity;

    public Fridge(){

    }

    public Fridge(String name, String brand, int price, int capacity){
        super.setName(name);
        super.setBrand(brand);
        super.setPrice(price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
