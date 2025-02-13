package homeworks.homework11addition.test;

import homeworks.homework11addition.model.Car;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[10];

        cars[0] = new Car("a123me", "Mercedes", "White", 0, 8300000);
        cars[1] = new Car("b873of", "Volga", "Black", 0, 673000);
        cars[2] = new Car("w487mn", "Lexus", "Grey", 76000, 900000);
        cars[3] = new Car("p987hj", "Volga", "Red", 610, 704340);
        cars[4] = new Car("c987ss", "Toyota", "White", 254000, 761000);
        cars[5] = new Car("o983op", "Toyota", "Black", 698000, 740000);
        cars[6] = new Car("p146op", "BMW", "White", 271000, 850000);
        cars[7] = new Car("u893ii", "Toyota", "Purple", 210900, 440000);
        cars[8] = new Car("I097df", "Toyota", "black", 108000, 780000);
        cars[9] = new Car("y876wd", "Toyota", "Black", 160000, 1000000);


        System.out.println("Первый авто ");
        System.out.println("Номер машины " + cars[0].getNumber() +  " Новая машина " +cars[0].getModel() + " Цвет машины " +
                cars[0].getColor() + " Пробег " +
                cars[0].getMileage() + " Цена " +
                cars[0].getCost());

        System.out.println("Все автомобили ");
        for (Car car : cars) {
            System.out.println(car);
        }

        List<String> numbers = Arrays.stream(cars)
                .filter(car -> car.getColor().equalsIgnoreCase("black") || car.getColor().equalsIgnoreCase("white"))
                        .map(Car::getNumber)
                        .collect(Collectors.toList());

        System.out.println("Номера автомобилей   по   цвету " + numbers);

        long uniqueCarsCount = Arrays.stream(cars)
                .map(Car::getModel)
                .distinct()
                .count();

        System.out.println("Уникальные автомобили: " + uniqueCarsCount + " шт.");

        Optional<Car> minCostcar = Arrays.stream(cars)
                .min(Comparator.comparing(Car::getCost));

        minCostcar.ifPresent(car -> System.out.println("Цвет автомобиля с минимальной стоимостью: " + car.getColor()));


        OptionalDouble midCostToyota = Arrays.stream(cars)
                .filter(car -> "Toyota".equalsIgnoreCase(car.getModel()))// Оставляю только Toyota
                .mapToInt(Car::getCost)// Преобразуем в цены (int) в значение
                .average();// Находим среднее значение

                if (midCostToyota.isPresent()) {
                    System.out.println("Средняя цена автомобилей Toyota: " + (int) midCostToyota.getAsDouble() + " руб ");
                } else {
                    System.out.println("Таких машин нет");
                }


    }
}
