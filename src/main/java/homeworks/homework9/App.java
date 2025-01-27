package homeworks.homework9;

import homeworks.homework9.model.Car;

public class App {
    public static void main (String [ ] args) {

        Car car = new Car();
        car.setBrand("BMW");
        car.setAcceleration(200);
        car.setHP(250);
        car.setSuspension(200);
        car.setDurability(2000);
        car.setRelease(2020);

        Car car1 = new Car ();
        car.setBrand("Porche");
        car.setAcceleration(225);
        car.setHP(280);
        car.setSuspension(180);
        car.setDurability(2250);
        car.setRelease(2019);

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
