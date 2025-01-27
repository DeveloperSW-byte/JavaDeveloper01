package homeworks.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrows {

 public static void main(String[] args) {

     String arrows = ">>-->><<--<<";

     Pattern pattern = Pattern.compile(">>-->|<--<<");
     Matcher matcher = pattern.matcher(arrows);

     int count = 0;

     while (matcher.find()){
         count++;
     }

     System.out.println(count);


 }


}
