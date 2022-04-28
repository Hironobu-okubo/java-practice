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

    @Override
    public void attack(Character opponent){
        int damage = super.getOffense() + this.weapon - super.getDeffense();

        if(damage > 0){
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(super.getName() + " は " + opponent.getName() + " に " + damage + " のダメージを与えた！");
        }else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！ " + super.getName() + " は " + opponent.getName() + " にダメージを与えられない！");
        }
    }

}

