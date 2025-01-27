package homeworks.homework6;

import java.util.Arrays;
import java.util.Objects;

public class person {
    private String name;
    private int money;
    private product[] basket = new product[10];

    private int index = 0;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return money == person.money && index == person.index && age == person.age && Objects.equals(name, person.name) && Objects.deepEquals(basket, person.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, Arrays.hashCode(basket), index, age);
    }

    private int age;



    @Override
    public String toString() {
        if (index == 0){
            return "person{" +
                    "name='" + name + '\'' +
                    ", money=" + money +
                    ", basket= Ничего не куплено" +
                    ", index=" + index +
                    '}';
        }
        return "person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", basket=" + Arrays.toString(basket) +
                ", index=" + index +
                '}';
    }



    public void addProductToBasket(product product) {
        if (this.money >= product.getPrice()){
            this.basket[index] = product;
            this.money -= product.getPrice();
            index++;
            System.out.println("Продукт " + product.getName() + " успешно добавлен в корзину.");
        } else {
            System.out.println(getName() + " не может позволить себе " + product.getName());
        }
        if (this.money == 0){
            System.out.println("Ничего не куплено");
        }
    }


    public person(String name, Integer money){
        if (money < 0) {
            throw new IllegalArgumentException("Деньги немогут быть отрицательным числом ");
        }
        this.name = name;
        this.money = money;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public product[] getBasket() {
        return basket;
    }

    public void setBasket(product[] basket) {
        this.basket = basket;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
