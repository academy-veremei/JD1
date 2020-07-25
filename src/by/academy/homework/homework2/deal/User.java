package by.academy.homework.homework2.deal;

import by.academy.homework.homework2.BelarusPhoneValidator;
import by.academy.homework.homework2.EmailValidator;
import by.academy.homework.homework2.Validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    private String userName;
    private String userDateOfBirth;
    private String userPhoneNumber;
    private String userEmail;

    public User() {
        super();
    }

    public User(String userName) {
        super();
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isValidDateString(String stringDate) {
        Pattern patternA = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
        Pattern patternB = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

        Matcher matcherA = patternA.matcher(stringDate);
        Matcher matcherB = patternB.matcher(stringDate);

        if (matcherA.find()) {
            return true;
        } else return matcherB.find();
    }

    public void inputUserData(String name) {
        Scanner scanner = new Scanner(System.in);

        Validator belarusPhone = new BelarusPhoneValidator();
        Validator emailValidator = new EmailValidator();

        System.out.println("Введите имя " + name);

        userName = scanner.nextLine();
        do {
            System.out.println("Введите дату рождения в формате dd/MM/yyyy или dd-MM-yyyy");
            userDateOfBirth = scanner.nextLine();
        } while (!isValidDateString(userDateOfBirth));
        do {
            System.out.println("Введите номер телефона формата +375********* :");
            userPhoneNumber = scanner.nextLine();
        } while (!belarusPhone.validate(userPhoneNumber));
        do {
            System.out.println("Введите email:");
            userEmail = scanner.nextLine();
        } while (!emailValidator.validate(userEmail));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(userName).append(" Дата рождения: ").append(userDateOfBirth).append(" Телефон: ")
                .append(userPhoneNumber).append(" Электронная почта:").append(userEmail).append(" \n");
        return stringBuilder.toString();
    }
}
