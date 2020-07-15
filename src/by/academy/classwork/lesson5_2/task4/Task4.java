/*
 * Lesson 5.2 ООП.Закрепление Задание 4
 *
 * 14.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5_2.task4;

public class Task4 {
    public static void main(String[] args) {
        Reader reader = new Reader("Зубенко М.П.", 203, "PO", 120590, 2020327);
        Book firstBook = new Book("Книга 1", "Автор 1");
        Book secondBook = new Book("Книга 2", "Автор 2");
        Book thirdBook = new Book("Книга 3", "Автор 3");

        reader.takeBook(3);

        reader.takeBook("Книга1", "Книга2", "Книга3", "Книга4");

        reader.takeBook(firstBook.getBookName(), secondBook.bookName, thirdBook.bookName);

        reader.returnBook(3);

        reader.returnBook("Книга1", "Книга2", "Книга3", "Книга4");

        reader.returnBook(firstBook.getBookName(), secondBook.bookName, thirdBook.bookName);
    }

}
