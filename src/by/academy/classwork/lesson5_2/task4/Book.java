package by.academy.classwork.lesson5_2.task4;

public class Book {
    String bookName;
    String bookAuthorName;

    public Book(){
        super();
    }
    public Book(String bookName,String bookAuthorName){
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
