package JAVA25.Level14_Classes;

public class Lecture4_1 {
    static void main() {
        Books books1 = new Books("Загадочный роман");
        Books books2 = new Books("Путешествие по космосу", 500);
        System.out.println(books1.bookTitle);
        System.out.println(books1.pageCount);
        System.out.println(books2.bookTitle);
        System.out.println(books2.pageCount);
    }
}

class Books {
    String bookTitle;
    int pageCount;

    public Books(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Books(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }
}
