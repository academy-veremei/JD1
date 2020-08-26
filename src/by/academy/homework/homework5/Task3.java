/*
 * Homework 5 Файлы.
 * Задание 2
 *
 * Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). В классе Main создайте
 * ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог(папку) users и для каждого пользователя
 * создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите
 * в файл пользователя. Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран
 * (System.err.println(e.getMessage());)
 *
 * 24.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("firstName1", "lastName1", 20));
        users.add(new User("firstName2", "lastName2", 21));
        users.add(new User("firstName3", "lastName3", 22));
        users.add(new User("firstName4", "lastName4", 23));
        users.add(new User("firstName5", "lastName5", 24));
        users.add(new User("firstName6", "lastName6", 25));
        users.add(new User("firstName7", "lastName7", 26));
        users.add(new User("firstName8", "lastName8", 27));
        users.add(new User("firstName9", "lastName9", 28));
        users.add(new User("firstName10", "lastName10", 29));

        for (User user : users) {
            try (ObjectOutputStream objOutStr = new ObjectOutputStream(
                    new FileOutputStream("./src/by/academy/homework/homework5/homework5_io/users/"
                            + user.getFirstName() + "_" + user.getLastName() + ".txt"))) {

                objOutStr.writeObject(user);

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
