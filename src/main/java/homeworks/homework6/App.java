package homeworks.homework6;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя покупателя:  ");
        String name = scanner.nextLine();
        if (name.equals("")){
            throw new IllegalArgumentException("Имя не может быть пустой строкой ");}

        System.out.print("Введите бюджет покупателя: ");
        int money = scanner.nextInt();


        person buyer = new person(name, money);

        System.out.println("Добавтье продукты в корзину");
        scanner.nextLine();
        boolean check = true;
        while (check){
            System.out.print("Введите название продукта: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("END")) {
                break;
            }
            System.out.print("Введите цену продукта: ");
            int price;
            try {
                price = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Стоимость продукта не можетбыть отрицательным числом ");
                continue;
            }
            product newProduct = new product(name, price);
            buyer.addProductToBasket(newProduct);
        }
        System.out.println("Корзина покупателя:");
        for (int i = 0; i < buyer.getIndex(); i++) {
            product newProduct = buyer.getBasket()[i];
            if (newProduct != null) {

                //System.out.println("Корзина покупателя: " + buyer);
                System.out.println(buyer.getName() + "  купил  " + newProduct.getName());
            }
        }






















        //person Person1 = new person("Pavel Andreevich", 10000);
        //person Person2 = new person("Anna Petrovna", 2000);
        //person Person3 = new person("Boris", 10);

        //product product1 = new product("Xleb", 40);
        //product product2 = new product("Moloko", 60);
        //product product3 = new product("Tort", 1000);
        //product product4 = new product("Coffee", 879);
        //product product5 = new product("Maslo", 150);

        //Теперь нужно прописать цикл, где нужно сравнить деньги и цену и выводить возможность или невозможность покупки









    }
}
