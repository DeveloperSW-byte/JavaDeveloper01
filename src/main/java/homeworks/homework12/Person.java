package homeworks.homework12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Scanner;

public class Person {

    private String FIO;
    private String BD;
    private long NumberPh;
    private String sex;
    private int age;


    public Person(String FIO, String BD, int numberPh, String sex, int age) {
        this.FIO = FIO;
        this.BD = BD;
        NumberPh = numberPh;
        this.sex = sex;
        this.age = age;
    }

    public Person() {

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите Фамилию, имя, отчество(Через пробел): ");
            String input = scanner.nextLine();

        try {
            if (input.equals("")){
                throw new IllegalArgumentException("Имя не может быть пустой строкой ");
            }
            String[] Fio = input.split(" ");
            Boolean contains = input.contains(" ");
            FIO = input;
            if (contains != true) {
                throw new IllegalArgumentException("Вводить нужно через пробел!");
            } else {
                System.out.println("Фамилия Имя Отчество успешно сохранено: " + FIO);
            }
            break;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }



        }

    }
    public String getLastName() {
        return FIO.split("\\s+")[0]; // Фамилия (первое слово)
    }

    public String getFirstName() {
        return FIO.split("\\s+")[1]; // Имя (второе слово)
    }

    public String getMiddleName() {
        return FIO.split("\\s+")[2]; // Отчество (третье слово)
    }

    public String getBD() {
        return BD;
    }

    public void setBD() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while (true) {
            System.out.print("Введите дату рождения (dd.MM.yyyy): ");
            String input = scanner.nextLine();

            try {
                LocalDate date = LocalDate.parse(input, formatter); // Парсим строку в дату
                BD = date.format(formatter); // Сохраняем в правильном формате
                System.out.println("Дата рождения успешно сохранена: " + BD);
                break; // Выход из цикла при успешном вводе
            } catch (DateTimeParseException e) {
                System.out.println("Ошибка: неверный формат даты! Попробуйте снова.");
            }
        }
    }

    public long getNumberPh() {
        return NumberPh;
    }

    public void setNumberPh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String pn = scanner.nextLine();
        if (pn.length() < 11 || !pn.matches("\\d+")){
            throw new IllegalArgumentException("Номер телефона должен содержать 11 символов и без (+)");
        }
        NumberPh = Long.parseLong(pn);
        System.out.println("Номер успешно сохранён: " + NumberPh);
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пол (только f или m): ");
        String sx = scanner.nextLine();
        try {
            if (sx.equals("f") || sx.equals("m")) {
                System.out.println("Пол сохранён");
            } else {
                System.out.println("Нужно ввести только (f) или (m)");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        sex = sx;
    }
    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        String ag = scanner.nextLine();
        if (ag.length() < 2){
            throw new IllegalArgumentException("Возраст нужно ввести двухзначным числом");
        }
        age = Integer.parseInt(ag);
        System.out.println("Возраст успешно сохранён: " + age);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return NumberPh == person.NumberPh && age == person.age && Objects.equals(FIO, person.FIO) && Objects.equals(BD, person.BD) && Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, BD, NumberPh, sex, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "FIO='" + FIO + '\'' +
                ", BD='" + BD + '\'' +
                ", NumberPh=" + NumberPh +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

}

