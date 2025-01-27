package homeworks.homework7addition;

import homeworks.homework7addition.DiscountProduct;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя покупателя:  ");
        String bname = scanner.nextLine();
        if (bname.equals("")){
            throw new IllegalArgumentException("Имя не может быть пустой строкой ");}

        System.out.print("Введите возраст покупателя: ");
        int age = scanner.nextInt();
        if (age < 6){
            throw new IllegalArgumentException("Данный покупаетль не может покупать");
        }
        if(age > 6 && age <= 17){
            System.out.println("Это ребёнок ");
        }
        if(age > 18 && age <= 65){
            System.out.println("Это взрослый ");
        }
        if (age >= 65){
            System.out.println("Это пенсионер ");
        }

        System.out.print("Введите бюджет покупателя: ");
        int money = scanner.nextInt();

        person buyer = new person(bname, money, age);


        if (age > 6 && age <= 17) {
            System.out.println("Добавтье продукты в корзину");
            boolean check = true;
            while (check) {
                System.out.print("Введите название продукта: ");
                String name;
                name = scanner.nextLine();
                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                if (name.matches("^[0-9]+")) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }
                if (name.length() < 3) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }

                System.out.print("Введите цену продукта: ");
                int price;
                try {
                    price = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Цена должна быть положительным числом!");
                    continue;
                }
                if (price <= 0) {
                    throw new IllegalArgumentException("Недопустимая стоимость продукта!");
                }

                System.out.println("Введите скиду (0 для обычных продуктов)");
                int discount;
                try {
                    discount = Integer.parseInt(scanner.nextLine()); // Считываем скидку
                } catch (NumberFormatException e) {
                    System.out.println("Скидка должна быть числом!");
                    continue;
                }
                if (discount == 0) {
                    product newProduct = new product(name, price);
                    System.out.println("Обычный продукт " + name);
                } else if (discount > 0 && discount <= 100) {
                    DiscountProduct discountProduct = new DiscountProduct(name, price, discount);
                    System.out.println("Акционный продукт " + name);
                }
                DiscountProduct newdiscountProduct = new DiscountProduct(name, price, discount);
                product newProduct = new product(name, price);
                buyer.addProductToBasket(newProduct);
                buyer.adddiscountProductToBasket(newdiscountProduct);
            }
            System.out.println("Корзина покупателя:");
            for (int i = 0; i < buyer.getIndex(); i++) {
                product newProduct = buyer.getBasket()[i];
                if (newProduct != null) {

                    //System.out.println("Корзина покупателя: " + buyer);
                    System.out.println(buyer.getName() + "  купил  " + newProduct.getName());
                }
            }
        }

        if (age > 18 && age <= 65) {
            System.out.println("Вы берёте в кредит ");
            System.out.println("Добавтье продукты в корзину");
            boolean check = true;
            while (check) {
                System.out.print("Введите название продукта: ");
                String name;
                name = scanner.nextLine();
                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                if (name.matches("^[0-9]+")) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }
                if (name.length() < 3) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }

                System.out.print("Введите цену продукта: ");
                int price;
                try {
                    price = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Цена должна быть положительным числом!");
                    continue;
                }
                if (price <= 0) {
                    throw new IllegalArgumentException("Недопустимая стоимость продукта!");
                }

                System.out.println("Введите скиду (0 для обычных продуктов)");
                int discount;
                try {
                    discount = Integer.parseInt(scanner.nextLine()); // Считываем скидку
                } catch (NumberFormatException e) {
                    System.out.println("Скидка должна быть числом!");
                    continue;
                }
                if (discount == 0) {
                    product newProduct = new product(name, price);
                    System.out.println("Обычный продукт " + name);
                } else if (discount > 0 && discount <= 100) {
                    DiscountProduct discountProduct = new DiscountProduct(name, price, discount);
                    System.out.println("Акционный продукт " + name);
                }
                DiscountProduct newdiscountProduct = new DiscountProduct(name, price, discount);
                product newProduct = new product(name, price);
                buyer.addProductToBasket(newProduct);
                buyer.adddiscountProductToBasket(newdiscountProduct);
            }
            System.out.println("Корзина покупателя:");
            for (int i = 0; i < buyer.getIndex(); i++) {
                product newProduct = buyer.getBasket()[i];
                if (newProduct != null) {

                    //System.out.println("Корзина покупателя: " + buyer);
                    System.out.println(buyer.getName() + "  купил  " + newProduct.getName());
                }
            }
        }

        if (age >= 65) {
            System.out.println("Вы получате 5% скидки ");
            System.out.println("Добавтье продукты в корзину");
            boolean check = true;
            while (check) {
                System.out.print("Введите название продукта: ");
                String name;
                name = scanner.nextLine();
                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                if (name.matches("^[0-9]+")) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }
                if (name.length() < 3) {
                    System.out.println("Недопустимое имя продукта!");
                    continue;
                }

                System.out.print("Введите цену продукта: ");
                int price;
                try {
                    price = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Цена должна быть положительным числом!");
                    continue;
                }
                if (price <= 0) {
                    throw new IllegalArgumentException("Недопустимая стоимость продукта!");
                }

                System.out.println("Введите скиду (0 для обычных продуктов)");
                int discount;
                try {
                    discount = Integer.parseInt(scanner.nextLine()); // Считываем скидку
                } catch (NumberFormatException e) {
                    System.out.println("Скидка должна быть числом!");
                    continue;
                }
                if (discount == 0) {
                    product newProduct = new product(name, price);
                    System.out.println("Обычный продукт " + name);
                } else if (discount > 0 && discount <= 100) {
                    DiscountProduct discountProduct = new DiscountProduct(name, price, discount);
                    System.out.println("Акционный продукт " + name);
                }
                DiscountProduct newdiscountProduct = new DiscountProduct(name, price, discount);
                product newProduct = new product(name, price);
                buyer.addProductToBasket(newProduct);
                buyer.adddiscountProductToBasket(newdiscountProduct);
            }
            System.out.println("Корзина покупателя:");
            for (int i = 0; i < buyer.getIndex(); i++) {
                product newProduct = buyer.getBasket()[i];
                if (newProduct != null) {

                    //System.out.println("Корзина покупателя: " + buyer);
                    System.out.println(buyer.getName() + "  купил  " + newProduct.getName());
                }
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
