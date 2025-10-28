package JAVA25.Level23_OOP_Errors_BestPractics.Lecture4_TMP;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void printInfo() {
        System.out.println("Книга: " + title + ", автор: " + author);
    }
}
