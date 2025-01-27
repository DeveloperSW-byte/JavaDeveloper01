
import generic.Pair;

public class main {
}

public static void main(String[] args) {
    Pair<String, Integer> myPair = new Pair<>();
    myPair.getFirst("Hello");
    myPair.getSecond(123);
    System.out.println(myPair);
}