package Generics;

public class SilverShield extends Shield{
    public SilverShield(String name, int defense, int weight) {
        super(name, defense, weight);
    }

    @Override
    public String toString() {
        return "SilverShield{" + "name ="
                + getName() + super.toString() + "}";
    }
}
