package JAVA25.Level26;

import java.util.ArrayList;
import java.util.List;

public class Lecture5_1 {
    static class Book {
        private final String title;
        private final String author;

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1", "author1"));
        books.add(new Book("book2", "author2"));
        books.forEach((book -> System.out.printf("Название книги: %s, автор: %s.\n",book.getTitle(),book.getAuthor())));
    }
}
