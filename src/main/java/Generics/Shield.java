package Generics;

public class Shield {
    private String name;
    private int defense;
    private int weight;

    public Shield(String name, int defense, int weight) {
        this.name = name;
        this.defense = defense;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public int getWeight() {
        return weight;
    }
}
