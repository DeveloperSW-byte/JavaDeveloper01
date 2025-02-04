package homeworks.homework10;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] intArray =  Sequence.filter(new int[] {1, 2, 3}, number ->{
            System.out.println(number);
            return number % 2 == 0;
        });// лямбда выражение, в начале идёт параметр, и может не быть будут пустые (), в теле " number % 2 == 0"


        System.out.println(Arrays.toString(intArray));

    }
}
