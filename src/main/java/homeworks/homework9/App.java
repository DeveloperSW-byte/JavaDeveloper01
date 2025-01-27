package homeworks.homework9;

import homeworks.homework9.model.Car;

public class App {
    public static void main (String [ ] args) {

        Car car = new Car("BMW", "M5", 2020, 250, 200, 2000, 200);
        Car car1 = new Car ("Porsche", "GT6", 2019, 280, 225, 2250, 180);
        Car car2 = new Car ("VAZ", "2107", 1980, 110, 100, 5000, 100);
        PerfomanceCar perfomanceCar = new PerfomanceCar("Audi", "RS6", 2024, 425, 230, 2200, 200);

        Car car2 = new Car ();
        car.setBrand("VAZ");
        car.setAcceleration(100);
        car.setHP(110);
        car.setSuspension(100);
        car.setDurability(5000);
        car.setRelease(1980);

        Car car3 = new Car ();
        car.setBrand("Zeeker");
        car.setAcceleration(400);
        car.setHP(300);
        car.setSuspension(250);
        car.setDurability(1500);
        car.setRelease(2023);



    }
}
