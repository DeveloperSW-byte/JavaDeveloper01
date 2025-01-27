package stringpool;

public class StringPoolExample {
    public static void main(String[] args){
        String str1 = "Topjava";
        String str2 = "Topjava";
        String str3 = new String("Topjava");
        String str4 = new String("Topjava");

        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
        System.out.println("Строка 2 равна строке 3? " + (str2 == str3));
        System.out.println("Строка 3 равна строке 4? " + (str3 == str4));
    }
}
