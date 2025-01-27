package homeworks.homework7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        product[] products = new product[10];
        int productIndex = 0;
        boolean check = true;
        while (check) {
            System.out.print("Введите название продукта: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("END")) {
                break;
            }
            if (name.matches("[0-9]+") || name.length() < 3) {
                System.out.println("Недопустимое имя продукта!");
                continue;
            }

            System.out.print("Введите цену продукта: ");
            int price;
            try {
                price = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
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
                products[productIndex] = new product(name, price);
                System.out.println("Обычный продукт " + name);
            } else if (discount > 0 && discount <= 100) {
                products[productIndex] = new DiscountProduct(name, price, discount);
                System.out.println("Акционный продукт " + name);
            }
            productIndex++;
        }

            System.out.println("Продукты ");
        if (productIndex == 0) {
            System.out.println("Продукты не добавлены");
            }
        for (int i = 0; i < productIndex; i++) {
                System.out.println(products[i]);
            }



        }
    }

