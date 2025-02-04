package homeworks.homework11;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("a001oe", "FORD", "RED", 20000, 15000);


        System.out.println("Номер машины " + car1.getNumber() +  " Новая машина " +car1.getModel() + " Цвет машины " +
                car1.getColor() + " Пробег " +
                car1.getMileage() + " Цена " +
                car1.getCost());
    }
}
