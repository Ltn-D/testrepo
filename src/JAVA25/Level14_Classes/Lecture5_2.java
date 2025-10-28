package JAVA25.Level14_Classes;

public class Lecture5_2 {
    static void main(String[] args) {
        Book standardBook = new Book();

        // Выводим стандартные значения на экран
        System.out.println(standardBook.bookTitle);
        System.out.println(standardBook.pageCount);
    }
}

class Book {
    String bookTitle = "Без названия";
    int pageCount = 100;
}
