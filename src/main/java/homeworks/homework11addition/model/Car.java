package homeworks.homework11addition.model;

import java.util.Objects;

public class Car {
    String number;
    String model;
    String color;
    int mileage;
    int cost;

    public Car(String number, String model, String color, int mileage, int cost) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.cost = cost;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage && cost == car.cost && Objects.equals(number, car.number) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, color, mileage, cost);
    }

    @Override
    public String toString() {
        return  " Номер: " + number + '\'' +
                " Модель: " + model + '\'' +
                " Цвет: " + color + '\'' +
                " Пробег: " + mileage +
                " Цена: " + cost;
    }
}
