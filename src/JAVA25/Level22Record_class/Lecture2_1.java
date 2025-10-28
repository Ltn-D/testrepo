package JAVA25.Level22Record_class;

public class Lecture2_1 {
    static void main(String[] args) {
        Book favoriteBook = new Book("Effective Java", "Joshua Bloch");
        System.out.println("Название: " + favoriteBook.title());
        System.out.println("Автор: " + favoriteBook.autor());
    }

    static record Book(String title, String autor) {}
}
