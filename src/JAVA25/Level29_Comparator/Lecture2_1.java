package JAVA25.Level29_Comparator;

import java.util.Objects;

public class Lecture2_1 {
    static class Book {
        private String bookTitle;
        private String bookAuthor;

        public Book(String bookTitle, String bookAuthor) {
            this.bookTitle = bookTitle;
            this.bookAuthor = bookAuthor;
        }

        @Override
        public boolean equals(Object object) {
            if (this ==object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Book book = (Book) object;
            return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookTitle, bookAuthor);
        }
    }

    static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");

        // Выводим вычисленный хеш-код объекта Book
        System.out.println(book.hashCode());
    }
}
