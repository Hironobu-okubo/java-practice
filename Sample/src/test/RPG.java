package test;

public class RPG {

    public static void main(String[] args) {
        Character hero = new Character("勇者",10,5,3);
        Character slime = new Character("スライム",5,2,2);

        hero.attack(slime);
        slime.attack(hero);

    }

}
