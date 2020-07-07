/*
 * Homework 1 Операторы. Циклы.
 * Задание 1
 *
 * 05.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float amount;
        float discount;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма:");
        amount = scanner.nextFloat();
        System.out.println("Возраст:");
        age = scanner.nextInt();
        scanner.close();
        if(amount<100){
            discount = amount * 0.05f;
            amount = amount - discount;
            System.out.println("Финальная цена: "+amount);
        }else if(amount >= 100 && amount < 200){
            discount = amount * 0.07f;
            amount = amount - discount;
            System.out.println("Финальная цена: "+amount);
        }else if(amount >= 200 && amount<300){
            if(age>18) {
                discount = amount * 0.16f;
            }else {
                discount = amount * 0.09f;
            }
            amount = amount - discount;
            System.out.println("Финальная цена: " + amount);
        }else if(amount >= 300 && amount < 400){
            discount = amount*0.15f;
            amount = amount - discount;
            System.out.println("Финальная цена: "+amount);
        }else if(amount >= 400){
            discount = amount * 0.2f;
            amount = amount - discount;
            System.out.println("Финальная цена: "+amount);
        }
    }
}
