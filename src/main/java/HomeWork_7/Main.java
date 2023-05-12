package HomeWork_7;

public class Main {
    public static void main(String[] args) {
        MachineC<Coffee> coffee = new MachineC<>();
        MachineC<MilkCoffee>milkCoffee = new MachineC<>();
        coffee.setCoffee(new Coffee("Espresso", 30));
        coffee.setCoffee(new Coffee("Americano", 200));
        milkCoffee.setCoffee(new MilkCoffee("Cappuccino", 200, 50));
        milkCoffee.setCoffee(new MilkCoffee("Latte", 300, 45));

        coffee.finishCoffee();
        milkCoffee.finishCoffee();

    }
}
