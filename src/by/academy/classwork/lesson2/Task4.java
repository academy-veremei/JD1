/*
 * Lesson 2 Задание 4
 *
 * 30.06.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson2;

class Task4{
    public static void main(String[] args){
        int s = 3700;
        int sec;
        int m;
        int min, h;
        int hour;
        int d, day;
        int week;
        sec = s % 60;
        m = (s - sec)/60;
        min = m % 60;
        h = (m - min)/60;
        hour = h % 60;
        d = (h - hour)/24;
        day = d % 24;
        week = d % 7;
        System.out.println(week+"weeks "+day+"days "+hour+"hours "+min+"minutes "+sec+"seconds ");
    }
}
