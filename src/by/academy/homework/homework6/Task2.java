/*
 * Homework 6 Stream.Lambda.JUnit.
 * Задание 2
 *
 * a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
 * b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
 * c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и методы,
 *      сначала через
 *          getMethod("name")
 *          getMethods()
 *          getField("name")
 *          getFields()
 *      а затем через
 *          getDeclaredMethod("name")
 *          getDeclaredMethods()
 *          getDeclaredField("name")
 *          getDeclaredFields()
 * Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field). Вывести значения полей через
 * Reflection. (get метод класса Field). Вызвать toString через invoke.
 *
 * 06.09.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        User user = new User();

        Class<? extends Person> classUser = user.getClass();

        getMethod(classUser);
        getMethods(classUser);
        getField(classUser);
        getFields(classUser);

        getDeclaredMethod(classUser);
        getDeclaredMethods(classUser);
        getDeclaredField(classUser);
        getDeclaredFields(classUser);

        setAndPrint(user);

        try {
            Method toString = classUser.getMethod("toString");
            System.out.println(toString.invoke(user));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    //Step:1 Вывести все методы через getMethod
    public static void getMethod(Class<?> classUser) {
        System.out.println("**********  Step 1: getMethod(\"name\") **********");
        try {
            ArrayList<Method> methods = new ArrayList<>();

            methods.add(classUser.getMethod("getFirstName"));
            methods.add(classUser.getMethod("getLastName"));
            methods.add(classUser.getMethod("getAge"));
            methods.add(classUser.getMethod("getDateOfBirth"));
            methods.add(classUser.getMethod("getLogin"));
            methods.add(classUser.getMethod("getPassword"));
            methods.add(classUser.getMethod("getEmail"));

            methods.add(classUser.getMethod("setFirstName", String.class));
            methods.add(classUser.getMethod("setLastName", String.class));
            methods.add(classUser.getMethod("setAge", int.class));
            methods.add(classUser.getMethod("setDateOfBirth", LocalDate.class));
            methods.add(classUser.getMethod("setLogin", String.class));
            methods.add(classUser.getMethod("setPassword", String.class));
            methods.add(classUser.getMethod("setEmail", String.class));

            methods.add(classUser.getMethod("printUserInfo"));

            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
            System.out.println("********** /Step 1 **********\n");
        }
    }

    //Step:2 Вывести все методы через getMethods
    public static void getMethods(Class<?> classUser) {
        System.out.println("**********  Step 2: getMethods() **********");

        Method[] methods = classUser.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("********** /Step 2 **********\n");
    }

    //Step:3 Вывести все поля через getField
    public static void getField(Class<?> classUser) {
        System.out.println("**********  Step 3: getField(\"name\") **********");
        try {
            ArrayList<Field> fields = new ArrayList<>();

            fields.add(classUser.getField("firstName"));
            fields.add(classUser.getField("lastName"));
            fields.add(classUser.getField("age"));
            fields.add(classUser.getField("dateOfBirth"));

            fields.add(classUser.getField("login"));
            fields.add(classUser.getField("password"));
            fields.add(classUser.getField("email"));

            for (Field f : fields) {
                System.out.println(f);
            }
        } catch (NoSuchFieldException e) {
            System.out.println("Для private/protected нужно использовать getDeclaredField.");
        } finally {
            System.out.println("********** /Step 3 **********\n");
        }
    }

    //Step:4 Вывести все поля через getFields
    public static void getFields(Class<?> classUser) {
        System.out.println("**********  Step 4: getFields() **********");

        Field[] fields = classUser.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("Для private/protected нужно использовать getDeclaredFields.");
        System.out.println("********** /Step 4 **********\n");
    }

    //Step:5 Вывести все методы через getDeclaredMethod
    public static void getDeclaredMethod(Class<?> classUser) {
        System.out.println("**********  Step 5: getDeclaredMethod(\"name\") **********");

        try {
            ArrayList<Method> methodsDeclared = new ArrayList<>();

            methodsDeclared.add(classUser.getDeclaredMethod("getLogin"));
            methodsDeclared.add(classUser.getDeclaredMethod("getPassword"));
            methodsDeclared.add(classUser.getDeclaredMethod("getEmail"));

            methodsDeclared.add(classUser.getDeclaredMethod("setLogin", String.class));
            methodsDeclared.add(classUser.getDeclaredMethod("setPassword", String.class));
            methodsDeclared.add(classUser.getDeclaredMethod("setEmail", String.class));

            methodsDeclared.add(classUser.getDeclaredMethod("printUserInfo"));

            for (Method m : methodsDeclared) {
                System.out.println(m);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
            System.out.println("********** /Step 5 **********\n");
        }
    }

    //Step:6 Вывести все методы через getDeclaredMethods
    public static void getDeclaredMethods(Class<?> classUser) {
        System.out.println("**********  Step 6: getDeclaredMethods() **********");

        Method[] methods = classUser.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("********** /Step 6 **********\n");
    }

    //Step:7 Вывести все поля через getDeclaredField
    public static void getDeclaredField(Class<?> classUser) {
        System.out.println("**********  Step 7: getDeclaredField(\"name\") **********");
        try {
            ArrayList<Field> fields = new ArrayList<>();

            fields.add(classUser.getDeclaredField("login"));
            fields.add(classUser.getDeclaredField("password"));
            fields.add(classUser.getDeclaredField("email"));

            for (Field f : fields) {
                System.out.println(f);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            System.out.println("********** /Step 7 **********\n");
        }
    }

    //Step:8 Вывести все поля через getDeclaredFields
    public static void getDeclaredFields(Class<?> classUser) {
        System.out.println("**********  Step 8: getDeclaredFields() **********");

        Field[] fields = classUser.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("********** /Step 8 **********\n");
    }

    //Step:9 Просетать и вывести значения полей через Reflection
    public static void setAndPrint(User user) {
        System.out.println("**********  Step 9: setAndPrint **********");
        try {
            Class<?> classUser = user.getClass();
            Class<?> superUser = classUser.getSuperclass();

            Field firstName = superUser.getDeclaredField("firstName");
            firstName.setAccessible(true);
            firstName.set(user, "fName");
            System.out.println(firstName.get(user));

            Field lastName = superUser.getDeclaredField("lastName");
            lastName.setAccessible(true);
            lastName.set(user, "lName");
            System.out.println(lastName.get(user));

            Field age = superUser.getDeclaredField("age");
            age.setAccessible(true);
            age.set(user, 20);
            System.out.println(age.get(user));

            Field dateOfBirth = superUser.getDeclaredField("dateOfBirth");
            dateOfBirth.setAccessible(true);
            dateOfBirth.set(user, LocalDate.of(2000, 1, 1));
            System.out.println(dateOfBirth.get(user));

            Field login = classUser.getDeclaredField("login");
            login.setAccessible(true);
            login.set(user, "admin");
            System.out.println(login.get(user));

            Field password = classUser.getDeclaredField("password");
            password.setAccessible(true);
            password.set(user, "qwerty123");
            System.out.println(password.get(user));

            Field email = classUser.getDeclaredField("email");
            email.setAccessible(true);
            email.set(user, "fNamelName@gmail.com");
            System.out.println(email.get(user));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            System.out.println("********** /Step 9 **********\n");
        }
    }

}
