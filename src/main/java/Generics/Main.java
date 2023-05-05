package Generics;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();// объявляем команды: лучники и рыцари
        Team<Knight>knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), )
                .addPersons(new Archer("Thomas", 100, new Bow(15)));
        knights.addPersons(new Knight("Rick", 150, new Knife()))
                .addPersons(new Knight("Tim", 150, new Knife()));
        Archer archer1 = new Archer("Robin", 100, new Bow(20));
        Archer archer2 = new Archer("Thomas", 100, new Bow(15));
        Battle fight = new Battle(archer1, archer2);
        fight.run();

    }
}
