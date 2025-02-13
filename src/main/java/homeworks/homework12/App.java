package homeworks.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество людей: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            Person person = new Person();.
            System.out.println("\nДобавление человека #" + (i + 1));
            person.setFIO();
            person.setBD();
            person.setNumberPh();
            person.setSex();
            person.setAge();
            persons.add(person);

            System.out.println("<" + person.getLastName()+ ">"+ "<" + person.getFirstName()+ ">" + "<" + person.getMiddleName()+ ">" + "<" + person.getBD()+ ">" + "<"
                    + person.getNumberPh()+ ">" + "<" + person.getSex()+ ">"+ "<" + person.getAge()+ ">" );
            // Запись в файл
            saveToFile(persons, "persons.txt");

            // Чтение из файла и вывод
            System.out.println("\nСписок людей из файла:");
            readFromFile("persons.txt");
        }













    }
}
