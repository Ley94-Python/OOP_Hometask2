package org.example;
public class Parents {
    private Status status;
    private Person person;
    public Parents(Person person, Status status){
        this.person = person;
        this.status = status;
    }
    public Status getStatus(){

        return status;
    }
    public String getName(){
        return person.getName();
    }

    @Override
    public String toString() {
        return "Parents{" + person.getName() +
                " status=" + status +
                '}';
    }
}
