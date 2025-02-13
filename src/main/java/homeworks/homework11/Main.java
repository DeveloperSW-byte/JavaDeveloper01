package homeworks.homework11;

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

        Car car1 = new Car("a123me", "Mercedes", "White", 0, 8300000);
        Car car2 = new Car("b873of", "Volga", "Black", 0, 673000);
        Car car3 = new Car("w487mn", "Lexus", "Grey", 76000, 900000);
        Car car4 = new Car("p987hj", "Volga", "Red", 610, 704340);
        Car car5 = new Car("c987ss", "Toyota", "White", 254000, 761000);
        Car car6 = new Car("o983op", "Toyota", "Black", 698000, 740000);
        Car car7 = new Car("p146op", "BMW", "White", 271000, 850000);
        Car car8 = new Car("u893ii", "Toyota", "Purple", 210900, 440000);
        Car car9 = new Car("I097df", "Toyota", "black", 108000, 780000);
        Car car10 = new Car("y876wd", "Toyota", "Black", 160000, 1000000);

        System.out.println("Первый авто ");
        System.out.println("Номер машины " + cars[0].getNumber() +  " Новая машина " +cars[0].getModel() + " Цвет машины " +
                cars[0].getColor() + " Пробег " +
                cars[0].getMileage() + " Цена " +
                cars[0].getCost());

        System.out.println("Все автомобили ");
        for (Car car : cars) {
            System.out.println(car);
        }



    }
}
