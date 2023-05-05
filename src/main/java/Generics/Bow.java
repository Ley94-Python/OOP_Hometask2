package Generics;

public class Bow extends Throwing{
    private String name;

    public Bow(int distance) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        return 10; // базовый урон
    }

    @Override
    public String toString() {
        return "Bow{" +
                "name='" + name +
                super.toString() +
                '}';
    }
}
