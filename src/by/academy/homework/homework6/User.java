//Добавить класс User, который наследуется от Person, с полями: login, password, email

package by.academy.homework.homework6;

import java.time.LocalDate;

public class User extends Person {
    private String login;
    private String password;
    private String email;

    public User() {
        super();
    }

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String firstName, String lastName, int age, LocalDate dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println(firstName + " " + lastName);
        System.out.println(age);
        System.out.println(dateOfBirth);
    }

}
