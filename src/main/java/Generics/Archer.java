package Generics;

import java.util.List;

public class Archer extends Warrior<Throwing>{
    public Archer(String name, int hp, Throwing weapon, List shields) {

        super(name, hp, weapon, shields);
    }
    public int getRange(){
        return rand.nextInt(weapon.getDistance() +1);

    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() + '}';
    }
}
