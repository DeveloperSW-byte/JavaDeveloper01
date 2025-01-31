package homeworks.homework9;

import homeworks.homework9.Racing.*;
import homeworks.homework9.model.Car;
import homeworks.homework9.model.PerfomanceCar;
import homeworks.homework9.model.ShowCar;

public class App {
    public static void main (String [ ] args) {
        Garage garage = new Garage();

        Car car = new Car("BMW", "M5", 2020, 250, 200, 2000, 200);
        Car car1 = new Car ("Porsche", "GT6", 2019, 280, 225, 2250, 180);
        Car car2 = new Car ("VAZ", "2107", 1980, 110, 100, 5000, 100);
        PerfomanceCar perfomanceCar = new PerfomanceCar("Audi", "RS6", 2024, 425, 230, 2200, 200);
        ShowCar showCar = new ShowCar("Mazda", "RX-7", 1978, 900, 200, 4000, 100, 50);

        garage.parkCar(car);
        garage.parkCar(car1);
        garage.parkCar(car2);
        garage.parkCar(perfomanceCar);
        garage.parkCar(showCar);

        garage.showParkedCars();


        Race race = new Race(800, "middle-factory", 2500, 5);
        CasualRace casualRace = new CasualRace(1200, "middle", 1200, 5);
        DragRace dragRace = new DragRace(500, "Airport", 2000, 2);
        DriftRace driftRace = new DriftRace(800, "Docs", 3000, 2);
        TimeLimitRace timeLimitRace = new TimeLimitRace(1000, "Yokohama", 2800, 5, 5);
        CircuitRace circuitRace = new CircuitRace(4000, "NASA AIRPORT", 10000, 10, 50);

        race.racers(car);
        race.racers(car1);
        race.racers(car2);
        race.racers(perfomanceCar);
        race.racers(showCar);
        race.showRacers();

        System.out.println("Машины призёры");
        System.out.println(race);
        System.out.println(casualRace);
        race.winner(race.getRacers(), 200);

        System.out.println("Самый мощный драг!!!");
        System.out.println(dragRace);
        dragRace.findMostPowerfulCar(race.getRacers());

        System.out.println("Дрифт!!!");
        System.out.println(driftRace);
        driftRace.mostDriftCar(race.getRacers());

        System.out.println("Доп.гонки");
        System.out.println(timeLimitRace);
        System.out.println(circuitRace);















    }
}
