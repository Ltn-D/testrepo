package JAVA25.Level29_Comparator;

import java.util.Comparator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture3_1 {
    static class Book implements Comparable <Book>{
        private String bookTitle;
        private int publicationYear;

        public Book(String bookTitle, int publicationYear) {
            this.bookTitle = bookTitle;
            this.publicationYear = publicationYear;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        @Override
        public int compareTo(Book book) {
            int result =  Integer.compare(this.getPublicationYear(), book.getPublicationYear());
            if (result == 0) {
                result = Objects.compare(this.getBookTitle(), book.getBookTitle(), Comparator.nullsFirst(String::compareToIgnoreCase));
            }
            return result;
        }
    }
    public static void main(String[] args) {
        // Создаем динамический список для хранения книг
        List<Book> catalog = new ArrayList<>();

        // Добавляем три книги; у двух — одинаковый год издания, но разные названия
        catalog.add(new Book("Компиляторы", 1990));
        catalog.add(new Book("Алгоритмы", 2000));
        catalog.add(new Book("Структуры данных", 2000));

        // Сортируем список согласно логике compareTo в классе Book
        Collections.sort(catalog);

        // Выводим названия книг по порядку после сортировки
        for (Book book : catalog) {
            System.out.println(book.getBookTitle());
        }
    }
}
