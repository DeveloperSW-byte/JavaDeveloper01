package homeworks.homework12;

import java.io.*;
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
            Person person = new Person();
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
    public static void saveToFile(List<Person> persons, String Persons) {//Создание метода для записи в файл
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(Persons))) {
            for (Person person : persons) {
                writer.write("<" + person.getLastName()+ ">"+ "<" + person.getFirstName()+ ">" + "<" + person.getMiddleName()+ ">" + "<" + person.getBD()+ ">" + "<"
                        + person.getNumberPh()+ ">" + "<" + person.getSex()+ ">"+ "<" + person.getAge()+ ">" );
                writer.newLine();
            }
            System.out.println("Данные успешно записаны в " + Persons);
        } catch (IOException e){
            System.out.println("Ошибка записи в файл: " + Persons);
        }
    }

    public static void readFromFile(String Person){//Создание метода для чтения файла
        try(BufferedReader reader = new BufferedReader(new FileReader(Person))) {
            String line;
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Ошибка при чтении файла" + e.getMessage());
        }
    }



}
