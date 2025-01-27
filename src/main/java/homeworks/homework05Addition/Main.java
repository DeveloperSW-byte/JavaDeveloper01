package homeworks.homework05Addition;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TV myTV1 = new TV("yes", "QLED", "4K", 75, 1, 75, true);
        TV myTV2 = new TV("yes", "DLED", "2K", 55, 9, 50, false);
        TV myTV3 = new TV("no", "QLED", "FULLHD", 43, 2, 53, true);
        TV myTV4 = new TV("no", "QLED", "2K", 75, 3, 61, false);
        TV myTV5 = new TV("yes", "DLED", "2K", 43, 4, 58, true);
        TV myTV6 = new TV("yes", "QLED", "4K", 50, 5, 63, false);
        TV myTV7 = new TV("no", "DLED", "2K", 65, 12, 72, true);
        TV myTV8 = new TV("yes", "DLED", "2K", 50, 25, 52, false);
        TV myTV9 = new TV("no", "QLED", "2K", 60, 6, 56, true);
        TV myTV10 = new TV("yes", "DLED", "2K", 55, 11, 67, false);


        TV[] TVs = new TV[10];
        TVs[0] = myTV1;
        TVs[1] = myTV2;
        TVs[2] = myTV3;
        TVs[3] = myTV4;
        TVs[4] = myTV5;
        TVs[5] = myTV6;
        TVs[6] = myTV7;
        TVs[7] = myTV8;
        TVs[8] = myTV9;
        TVs[9] = myTV10;


        System.out.println("Введите громкость: ");
        Scanner maxVolume = new Scanner(System.in);
        int Volume = maxVolume.nextInt();

        for (int i = 0; i < TVs.length; i++) {
            TV tv = TVs[i];
            if (tv.getTV_volume() >= Volume && tv.getTV_ON()) {
                System.out.println(tv);

                System.out.println("Телевизоры с громкостью от 50 до 70 " + Volume + ":");
            }

        }
        Arrays.sort(TVs, (tv1, tv2) ->Integer.compare(tv1.getChannel(), tv2.getChannel()));
        System.out.println("Телевизоры, отсортированные по каналу:");
        for (TV tv : TVs) {
            System.out.println(tv);

        }
    }
}