package test;

public class Character {
    //フィールド
    public String name;
    public int hp;
    public int offense;
    public int deffense;

    public Character(){

    }

    public Character(String name, int hp, int offense, int deffense){
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.deffense = deffense;
    }

    public void attack(Character opponent){
        int damage = this.offense - opponent.deffense;

        if(damage > 0){
            opponent.hp -= damage;
            System.out.println(this.name + "は" + opponent.name + "に" + damage + "にダメージを与えた");
        }else{
            System.out.println(this.name + "は" + opponent.name + "にダメージを与えられない");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public int getDeffense() {
        return deffense;
    }

    public void setDeffense(int deffense) {
        this.deffense = deffense;
    }

}
