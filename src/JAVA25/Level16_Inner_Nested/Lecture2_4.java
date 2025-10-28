package JAVA25.Level16_Inner_Nested;

public class Lecture2_4 {
    static void main(String[] args) {
        // Создаем книгу через статический вложенный класс Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Выводим информацию о книге (toString() возвращает строку в нужном формате)
        System.out.println(book);
    }

    public static class Book {
        private String bookTitle;
        private int pageCount;

        private Book(Builder builder) {
            this.bookTitle = builder.title;
            this.pageCount = builder.pages;
        }

        @Override
        public String toString() {
            return "Book: "  + bookTitle + ", " + pageCount +" pages";
        }

        public static class Builder {
            private String title;
            private int pages;

            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public Builder setPages(int pages) {
                this.pages = pages;
                return this;
            }

            public Book build() {
                return new Book(this);
            }
        }

    }
}
