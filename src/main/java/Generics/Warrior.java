package Generics;

import java.util.List;
import java.util.Random;

public class Warrior<T extends Weapon> extends Person{ //Реализуем  обобщение, путем расширения типов оружий Weapon, с пом.ю <T extends Weapon>.
    protected T weapon;
    protected static Random rand = new Random();//для подключения случайных чисел, static-так как рандомайзер оперирует не только конкретногго воина, но и все классы воинов
    private List shields;
    public Warrior(String name, int hp, T weapon, List shields){
        super(name, hp);
        this.weapon = weapon;
        this.shields = shields;
    }
    public int harm(){
        boolean isHit = rand.nextBoolean();//наносится ли воину к-л урон
        int damage = 0;
        if (isHit){
            damage = rand.nextInt(weapon.damage()+1);
        }
        return damage;

    }


    @Override
    public String toString() {
        return "Warrior{" +
                " name= " + getName() +
                " weapon= " + weapon +
                " hp= " + getHp() +
                super.toString() +
                '}';
    }
}
