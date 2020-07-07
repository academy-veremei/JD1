/*
 * Lesson 2 Задание 5
 *
 * 30.06.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson2;

import java.util.Scanner;

class Task5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number");
        int first = scan.nextInt();
        System.out.println("Input second number");
        int second = scan.nextInt();
        if(first>second){
            System.out.println(first+" is max");
            System.out.println(second+" is min");
        }else{
            System.out.println(second+" is max");
            System.out.println(first+" is min");
        }
        System.out.println("average is "+((first+second)/2));
    }
}
