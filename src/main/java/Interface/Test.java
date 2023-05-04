package Interface;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Sarah");
        animal1.showInfo();
        person1.showInfo();
    }
}
