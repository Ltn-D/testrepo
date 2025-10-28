package JAVA25.Level22Record_class;

public class Lecture1_1 {
    public static void main(String[] args) {
        // Создаем карточку для любимой книги, заполняя оба поля
        BookCard favorite = new BookCard("Мастер и Маргарита", "Михаил Булгаков");

        // Выводим все детали книги на экран
        System.out.println("Название: " + favorite.title());
        System.out.println("Автор: " + favorite.author());
    }
    static record BookCard(String title, String author) {}
}


