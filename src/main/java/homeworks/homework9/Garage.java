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

    public void showParkedCars(){
        if (parkedCars.isEmpty()){
            System.out.println("Гараж пуст");
        } else {
            System.out.println("Список машин припаркованных в гараже");
            for (Car car : parkedCars){
                System.out.println(car);
            }
        }
    }
}

