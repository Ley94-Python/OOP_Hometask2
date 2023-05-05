package Generics;

import java.util.List;

public class Knight extends Warrior<Knife> {
    public Knight(String name, int hp, Knife weapon, List shields) {
        super(name, hp, weapon, shields);
    }

    @Override
    public String toString() {
        return "Knight{" +
                        super.toString() + "}";
    }
}
