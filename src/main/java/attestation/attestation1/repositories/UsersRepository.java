package attestation.attestation1.repositories;

import attestation.attestation1.model.User;
import java.util.List;

public interface UsersRepository {

    void create(User user);  // Создание пользователя и запись в файл
    User findById(String id);  // Поиск пользователя по ID
    List<User> findAll();  // Выгрузка всех пользователей из файла
    void update(User user);  // Обновление существующего пользователя
    void deleteById(String id);  // Удаление пользователя по ID
    void deleteAll();  // Удаление всех пользователей
}
