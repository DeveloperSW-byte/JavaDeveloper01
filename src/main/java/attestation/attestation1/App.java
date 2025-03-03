package attestation.attestation1;
import attestation.attestation1.model.User;
import attestation.attestation1.repositories.UsersRepositoryFileImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
public class App {
    public static void main(String[] args) {
        //Создаем экземпляр репозитория
        UsersRepositoryFileImpl userRepo = new UsersRepositoryFileImpl("users.txt");



        //Создаем пользователей и записываем их в файл
        User user1 = new User(UUID.randomUUID().toString(),LocalDateTime.now(), "Ivan_123", "pass_1234", "pass_1234",
                "Иванов", "Иван", "Иванович", 30, true);
        User user2 = new User(UUID.randomUUID().toString(),LocalDateTime.now(), "Maha_345", "passo_234", "passo_234",
                "Петрова", "Мария", null, 25, false);


        userRepo.create(user1);
        userRepo.create(user2);
        System.out.println("Пользователи добавлены!");


        //Поиск пользователя по ID
        User foundUser = userRepo.findById(user1.getId());
        System.out.println("Пользователь найден: " + foundUser);

        //Выгрузка всех пользователей
        List<User> allUsers = userRepo.findAll();
        System.out.println("Все пользователи:");
        allUsers.forEach(System.out::println);

        //Обновление данных пользователя
        user1.setPassword("new_password123", "new_password123");
        userRepo.update(user1);
        System.out.println("Данные пользователя обновлены!");

        //Удаление пользователя по ID
        userRepo.deleteById(user2.getId());
        System.out.println("Пользователь удален!");

        //Удаление всех пользователей
        userRepo.deleteAll();
        System.out.println("Все пользователи удалены!");
    }

}
