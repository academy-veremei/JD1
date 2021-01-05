/*
 * Homework 3 Внутренние классы.Дженерики.
 * Задание 3
 *
 * Заменить в Deal все массивы на ArrayList.
 *
 * 05.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2.deal;

import java.util.Scanner;

public class Main {
    Check check = new Check();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main task = new Main();
        task.startNewDeal();
    }

    /*
     * При вводе 1 метод создает новый объект сделка и запускает startDeal() из класса Deal.
     *
     * При вводе 2 выводится итоговый чек с информацией по всем сделкам, если не введено ни одной сделки
     * программа закрывается.
     */
    private void startNewDeal() {
        boolean runDeal = true;
        int isNextDeal;
        do {
            System.out.println("Введите:\n" + "1 - Для ввода новой сделки.\n" + "2 - Для вывода итоговой информации " +
                    "по всем сделками и выхода из программы.");
            isNextDeal = scanner.nextInt();
            if (isNextDeal == 1) {
                Deal deal = new Deal();
                deal.startDeal();
                check.fillCheck(deal.toString());
            } else if (isNextDeal == 2) {
                break;
            }
        } while (runDeal);
        System.out.println(check.getCheck());
    }

}
