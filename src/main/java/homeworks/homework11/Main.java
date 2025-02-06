package homeworks.homework11;

public class Main {

    public static void main(String[] args) {

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

        System.out.println("Номер машины " + car1.getNumber() +  " Новая машина " +car1.getModel() + " Цвет машины " +
                car1.getColor() + " Пробег " +
                car1.getMileage() + " Цена " +
                car1.getCost());




    }
}
