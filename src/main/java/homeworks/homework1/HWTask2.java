package homeworks.homework1;

import java.util.Scanner;

public class HWTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых чила;");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((a/2) + (b/2));
        System.out.println(a == b);
        if (a >=10) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }if (a <=10) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}



