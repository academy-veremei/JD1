/*
 * Homework 5 Файлы.
 * Задание 4
 *
 * Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). Считываем текст из
 * 2-ого задания, получаем его длинну (576 символов). Для каждого файла генерируем рандомное число от 0 до 576,
 * достаем из текста (из 2 задания) такое-же количество символов (string.substring()) и сохраняем в наш файл.
 * Создайте файл result.txt и запишите туда список всех файлов и их размеры.
 *
 * 25.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        String text = readFile("./src/by/academy/homework/homework5/homework5_io/Task2.txt");
        int size = text.length();
        HashMap<Integer, Integer> result = writeFiles(text, size, "./src/by/academy/homework/homework5/homework5_io/task4_out/");
        writeResult(result, "./src/by/academy/homework/homework5/homework5_io/");
    }

    public static String readFile(String inputFile) {
        StringBuilder stringBuilder = new StringBuilder();
        String nextString;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {

            while ((nextString = bufferedReader.readLine()) != null) {
                stringBuilder.append(nextString);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return stringBuilder.toString();
    }

    public static HashMap<Integer, Integer> writeFiles(String text, int size, String fileOutPath) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i < 101; i++) {
            try (FileWriter fileWriter =
                         new FileWriter(fileOutPath + "File " + i + ".txt")) {

                int fileSize = randomNumber(size);
                result.put(i, fileSize);
                fileWriter.write(text.substring(0, fileSize));

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return result;
    }

    public static int randomNumber(int size) {
        Random random = new Random();
        return random.nextInt(size);
    }

    public static void writeResult(HashMap<Integer, Integer> result, String resultOutPath) {

        try (FileWriter writer = new FileWriter(resultOutPath + "Task4_result.txt")) {

            for (int i = 1; i < 101; i++) {
                writer.write("Номер файла: " + i + " Размер: " + result.get(i) + "\n");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
