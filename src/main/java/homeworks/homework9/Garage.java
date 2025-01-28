package homeworks.homework9;

import homeworks.homework9.model.Car;

public class Garage {
    private List<Car> parkedCars;

    public Garage(){
        this.parkedCars = new ArrayList<>();
    }

    public void parkCar(Car car) {
        parkedCars.add(car);
        System.out.println("Машина " + car.getBrand() + " " + car.getModel() + " припаркована в гараже.");
    }

    }
}
