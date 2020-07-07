/*
 * Homework 1 Операторы. Циклы.
 * Задание 6
 *
 * 05.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String firstWord;
        String secondWord;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое слово");
        firstWord = scanner.nextLine();
        System.out.println("Второе слово");
        secondWord = scanner.nextLine();
        scanner.close();
        if(firstWord.length() != secondWord.length()){
            System.out.println("false");
        }else{
            for(int i = 0;i < firstWord.length();i++){
                char firstChar = firstWord.charAt(i);
                for(int j = 0;j < secondWord.length();j++){
                    if(firstChar == secondWord.charAt(j)){
                        counter++;
                        break;
                    }
                }
            }
        }
        if(counter == secondWord.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
