package homeworks.homework3;

import java.util.Arrays;

public class Englistr {
    public static void main(String[] args){

        String input = "bca-cba";

        String[] parts = input.split ("-");

        String part1 = parts[0];
        String part2 = parts[1];

        char[] c = part1.toCharArray();
        char[] b = part2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(b);

        Arrays.toString(c);
        Arrays.toString(b);

        System.out.println(c);
        System.out.println(b);

    }
}
