package stringpool;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        int[] intArray = new int[] {1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9};

        long result = Stream.of(intArray)
                .flatMapToInt(Arrays::stream)
                .skip(6)
                //.limit(10)
                .peek(e -> System.out.println(e + " "))
                .filter(value -> value % 2 ==0)
                .distinct()
                .count();


        System.out.println("\n Количество элементов " + result);

    }
}
