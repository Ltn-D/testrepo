package JAVA25.Level20_interfaces;

public class Lecture1_2 {
    static void main(String[] args) {
        // Объявляем переменную универсального типа интерфейса Drawable — "инструмент для рисования"
        Drawable tool = new Circle(); // Присваиваем ей конкретную фигуру — круг

        // Вызываем метод draw() через переменную интерфейсного типа
        tool.draw(); // Ожидаемый вывод: "Drawing a circle"
    }

    interface Drawable {
        void draw();
    }

    static class Circle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

}
