package homeworks.homework9.model;

public class PerfomanceCar extends Car{

    public PerfomanceCar (String brand, String model, Integer release, Integer HP, Integer acceleration, Integer durability, Integer suspension){
        super(brand, model, release, (int)(HP * 1.5), acceleration, durability, (int)(suspension / 0.25));
        String[] addOns = new String[10];
    }

}
