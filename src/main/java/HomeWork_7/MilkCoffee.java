package HomeWork_7;

public class MilkCoffee {
    private String name;
    private float value;
    private int temperature;

    public MilkCoffee(String name, float value, int temperature) {
        this.name = name;
        this.value = value;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String toString() {
        return String.format("%s  %.1f  %d", name, value, temperature);}
}
