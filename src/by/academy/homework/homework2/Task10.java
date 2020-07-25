/*
 * Homework 2 Deal.RegExp.Строки.
 * Задание 10
 *
 * 20.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2;

public class Task10 {
    public static void main(String... args) {
        String[] arr = {"ввеессттии", "слов", "консоли", "Найти", "слово", "котором", "aa", "aaa", "aabb", "aaabbbccc",
                "число", "различных", "qw", "er", "ty"};
        int indexMinUnique = -1;
        int minUniqueChars = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentUniqueCounter = 0;
            char[] cArr = new char[65538];
            for (char c : arr[i].toCharArray()) {
                cArr[c]++;
            }
            for (char c : cArr) {
                if (c > 0) {
                    currentUniqueCounter++;
                }
            }
            if (currentUniqueCounter < minUniqueChars) {
                minUniqueChars = currentUniqueCounter;
                indexMinUnique = i;
            }
        }
        System.out.println(arr[indexMinUnique]);
    }
}
