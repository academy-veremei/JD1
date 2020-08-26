/*
 * Homework 5 Файлы.
 * Задание 1
 *
 * Прочесть информацию введеную с клавиатуры и записать в созданный вами txt файл, если введена "stop" строка тогда
 * закончить запись в файл.
 *
 * 22.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fw =
                     new FileWriter("./src/by/academy/homework/homework5/homework5_io/Task1.txt")) {
            boolean run = true;

            while (run) {
                String text = scanner.nextLine();

                if (!text.equals("stop")) {

                    fw.write(text + "\n");

                } else {
                    run = false;
                }

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
