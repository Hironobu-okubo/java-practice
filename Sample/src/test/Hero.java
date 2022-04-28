package test;

public class Hero extends Character {
    private int weapon;

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
    public Hero(){

    }
    public Hero(String name, int hp, int offense, int deffense, int weapon){
        super(name, hp, offense, deffense);
        this.weapon = weapon;
    }

}

