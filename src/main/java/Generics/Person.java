package Generics;

public abstract class Person {
    private String name;
    private int hp;
    public Person(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
//    проверяем жив ли наш воин
    public boolean isAlive(){
        return hp > 0;
    }
    // задаем ф-ю (reduce), уменьшающая здоровье воина
    public void reduceHP(int damage){
        hp -= damage;
        if (hp < 0){
            hp = 0;      // проверяется условие на невозможность перехода hp на отрицательное число
        }
    }
}
