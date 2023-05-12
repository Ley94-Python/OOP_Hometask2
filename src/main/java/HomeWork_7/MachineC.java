package HomeWork_7;

import java.util.ArrayList;
import java.util.List;

public class MachineC<T> implements CoffeeMachine{
    private T machineC;
    private List<T> finishCoffee = new ArrayList<>();

    public T getMachineC() {
        return machineC;
    }

    public void setMachineC(T machineC) {
        this.machineC = machineC;
    }

    @Override
    public void finishCoffee() {
        System.out.println(finishCoffee);
    }
    public void setCoffee(T machineC){
        finishCoffee.add(machineC);
    }
}
