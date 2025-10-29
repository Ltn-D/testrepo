package JAVA25.Level25_Git;

public class Lecture4_2 {
    static interface Renderable {
        void paint();
        default void adjustScale() {
            System.out.println("Размер объекта скорректирован по умолчанию.");
        }
        static void validateColorPalette() {
            System.out.println("Цветовая палитра проверена, всё в порядке!");
        }
    }
    public static void main(String[] args) {
        // Простейшая реализация Renderable через анонимный класс
        Renderable shape = () -> System.out.println("Отрисовываем фигуру");

        // Вызываем обязательный метод отрисовки
        shape.paint();


        // Демонстрация default-метода интерфейса
        shape.adjustScale();


        // Вызов статического метода напрямую через интерфейс
        Renderable.validateColorPalette();

    }
}
