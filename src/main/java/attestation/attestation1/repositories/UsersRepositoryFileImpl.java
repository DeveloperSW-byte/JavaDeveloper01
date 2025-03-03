package attestation.attestation1.repositories;

import attestation.attestation1.model.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {
    private final String fileName; // Имя файла для хранения

    // Конструктор с параметром для имени файла
    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void create(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(userToString(user) + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи пользователя в файл!", e);
        }
    }

    @Override
    public User findById(String id) {
        return findAll().stream()
                .filter(user -> user.getId() != null && user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                users.add(stringToUser(line));
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении пользователей из файла!", e);
        }
        return users;
    }

    @Override
    public void update(User user) {
        if (user == null || user.getId() == null) {
            throw new IllegalArgumentException("Ошибка: пользователь или его ID не могут быть null.");
        }
        List<User> users = findAll();
        boolean found = false;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(user.getId())) {
                users.set(i, user);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Ошибка: пользователь с ID " + user.getId() + " не найден.");
        }
        writeAll(users);
    }

    @Override
    public void deleteById(String id) {
        List<User> users = findAll();
        users.removeIf(user -> user.getId().equals(id));
        writeAll(users);
    }

    @Override
    public void deleteAll() {
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при удалении файла!", e);
        }
    }

    // Преобразование пользователя в строку
    private String userToString(User user) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%b",
                user.getId(),
                user.getDateTime(),
                user.getLogin(),
                user.getPassword(),
                user.getConfirmPassword(),
                user.getLastName(),
                user.getFirstName(),
                user.getMiddleName() != null ? user.getMiddleName() : "null",
                user.getAge() != null ? user.getAge() : "null",
                user.isWorker()
        );
    }

    // Преобразование строки в пользователя
    private User stringToUser(String line) {
        try {
            String[] parts = line.split(",");

            if (parts.length != 10) {
                throw new IllegalArgumentException("Ошибка! Некорректный формат строки: " + line);
            }

            String id = parts[0];
            LocalDateTime date = LocalDateTime.parse(parts[1]);
            String login = parts[2];
            String password = parts[3];
            String confirmPassword = parts[4];
            String lastName = parts[5];
            String firstName = parts[6];
            String middleName = parts[7].equals("null") ? null : parts[7];
            Integer age = parts[8].equals("null") ? null : Integer.valueOf(parts[8]);
            boolean isWorker = Boolean.parseBoolean(parts[9]);

            return new User(id, date, login, password, confirmPassword, lastName, firstName, middleName, age, isWorker);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при разборе строки: " + line, e);
        }
    }

    // Запись всех пользователей в файл
    private void writeAll(List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                writer.write(userToString(user) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи пользователей в файл!", e);
        }
    }
}
