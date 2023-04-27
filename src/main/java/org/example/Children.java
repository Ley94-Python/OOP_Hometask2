package org.example;

public class Children extends Parents{
    private Status status;
    private Person person;
    public Children(Person person, Status status){
        super(person, status);
    }
    public Status getStatus(){

        return status;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
