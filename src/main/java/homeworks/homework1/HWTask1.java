package homeworks.homework1;

import java.util.Scanner;

public class HWTask1 {
    public static void main(String[] args) {
        System.out.println("введите температуру");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double fahrenheit = n, celsius = 0.0;
        celsius = (fahrenheit - 32) / 1.8;
        System.out.println("температура цельсия" + celsius);
    }
}
