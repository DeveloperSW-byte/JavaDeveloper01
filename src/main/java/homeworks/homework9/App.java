package homeworks.homework9;

import homeworks.homework9.model.Car;
import homeworks.homework9.model.PerfomanceCar;
import homeworks.homework9.model.ShowCar;

public class App {
    public static void main (String [ ] args) {

        Car car = new Car("BMW", "M5", 2020, 250, 200, 2000, 200);
        Car car1 = new Car ("Porsche", "GT6", 2019, 280, 225, 2250, 180);
        Car car2 = new Car ("VAZ", "2107", 1980, 110, 100, 5000, 100);
        PerfomanceCar perfomanceCar = new PerfomanceCar("Audi", "RS6", 2024, 425, 230, 2200, 200);
        ShowCar showCar = new ShowCar("Mazda", "RX-7", 1978, 900, 200, 4000, 100, 50);





    }
}
