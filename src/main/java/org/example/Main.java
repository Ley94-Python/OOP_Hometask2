package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Petr", 45);
        Person person2 = new Person("Vasia", 16);


        Parents parents = new Parents(person, Status.parents);

        Children children = new Children(person2, Status.children);

        if(Status.parents == parents.getStatus()){
            System.out.printf("%s является ролителем %s", parents, children);
        }
    }
}