/*
 * Homework 4 Коллекции.Исключения.
 * Задание 5
 *
 * Дан указатель на последний элемент двусвязного списка(head). Head может быть null, это говорит о том,
 * что список пуст, возвращаем null. Поменять порядок элементов в списке на обратный.
 * Измените следующий(next) и предыдущий (prev) указатели всех узлов, чтобы направление списка изменилось.
 * Вернуть список на последний элемент измененного(перевернутого) списка.
 *
 * 15.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework4;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode { int data; DoublyLinkedListNode next; DoublyLinkedListNode prev; }
     *
     */
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode tempNext;
        DoublyLinkedListNode tempPrev;

        while (head.next != null) {
            tempNext = head.next;
            tempPrev = head.prev;
            head.next = tempPrev;
            head.prev = tempNext;
            head = tempNext;
        }

        head.next = head.prev;
        head.prev = null;

        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        DoublyLinkedList llist = new DoublyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        DoublyLinkedListNode llist1 = reverse(llist.head);

        printDoublyLinkedList(llist1, " ");
        scanner.close();
    }
}
