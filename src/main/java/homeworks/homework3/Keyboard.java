package homeworks.homework3;

import java.util.Scanner;

import static java.lang.System.*;
public class Keyboard {
    public static void main(String[] args){

        String keyboard = "qwertyuiopasdfghjklzxcvbnm";

       char[] Key =  keyboard.toCharArray();

       Scanner sc = new Scanner(in);
       System.out.print("Введите символ клавиатуры: ");

        char input = sc.next().charAt(0);

        for (int i = 0; i < keyboard.length(); i++) {
            if (keyboard.charAt(i) == input) {
                int leftIndex = (i - 1 + keyboard.length()) % keyboard.length();

                System.out.println("Слева от " + input + " находится буква: " + keyboard.charAt(leftIndex));
                return;
            }
        }
    }
}
