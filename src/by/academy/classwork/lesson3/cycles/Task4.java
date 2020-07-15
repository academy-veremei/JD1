/*
 * Lesson 3 Циклы Задание 4
 *
 * 01.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson3.cycles;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] mass = new int[10];
        int otr = 0;
        int pol = 0;
        int nol = 0;
        for(int i=0; i<mass.length; i++){
            mass[i] = scan.nextInt();
        }
        for(int j=0; j<mass.length; j++){
            if(mass[j]<0){
                otr++;
            }
            if(mass[j]>0){
                pol++;
            }
            if(mass[j]==0){
                nol++;
            }
        }
        System.out.println("otr "+otr);
        System.out.println("pol "+pol);
        System.out.println("null "+nol);
    }
}
