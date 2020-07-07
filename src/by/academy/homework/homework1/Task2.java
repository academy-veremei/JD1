/*
 * Homework 1 Операторы. Циклы.
 * Задание 2
 *
 * 05.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType;
        System.out.println("Тип данных:");
        dataType = scanner.nextLine().toLowerCase();
        System.out.println("Переменная:");
        switch (dataType){
            case "int":
                int dataInt = scanner.nextInt();
                System.out.println(dataInt % 2);
                break;
            case "double":
                double dataDouble = scanner.nextDouble();
                System.out.println(dataDouble * 0.7d);
                break;
            case "float":
                float dataFloat = scanner.nextFloat();
                System.out.println(dataFloat * dataFloat);
                break;
            case "char":
                String dataChar = scanner.nextLine();
                for(int i = 0;i < dataChar.length();i++){
                    System.out.println((int)dataChar.charAt(i));
                }
                break;
            case "string":
                String dataString = scanner.nextLine();
                System.out.println("Hello "+dataString);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scanner.close();
    }
}
