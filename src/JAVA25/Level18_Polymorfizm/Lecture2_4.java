package JAVA25.Level18_Polymorfizm;

public class Lecture2_4 {
    static void main(String[] args) {
        // Создаем квадрат 5x5 (используем конструктор с одним параметром)
        Rectangle square = new Rectangle(5);

        // Создаем прямоугольник 10x7 (используем конструктор с двумя параметрами)
        Rectangle rectangle = new Rectangle(10, 7);

        // Выводим значения width и height для обоих объектов (через пробел)
        System.out.println(square.width + " " + square.height);
        System.out.println(rectangle.width + " " + rectangle.height);
    }

    static class Rectangle {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(int value) {
            this.width = value;
            this.height = value;
        }
    }

}