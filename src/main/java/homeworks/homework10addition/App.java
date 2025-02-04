package homeworks.homework10addition;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Optional<String> optionalS = Optional.of(null);

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();


        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();


        System.out.println("Должны быть равны pair and pair2 = " + mustBeTrue);
        System.out.println("Точной должны быть равны pair and pair2 = " + mustAlsoBeTrue);


    }
}
