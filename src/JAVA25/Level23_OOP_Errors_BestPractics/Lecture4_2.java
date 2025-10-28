package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture4_2 {
    static abstract class Shape {
        abstract void printType();
    }

    static class Circle extends Shape {
        @Override
        public void printType() {
            System.out.println("Круг");
        }
    }

    static class Square extends Shape {
        @Override
        public void printType() {
            System.out.println("Квадрат");
        }
    }
    public static void main(String[] args) {
        // "Холст" для фигур: массив общего типа Shape (демонстрация полиморфизма)
        Shape[] canvas = new Shape[2];

        // Добавляем по одному объекту каждой конкретной фигуры
        canvas[0] = new Circle();
        canvas[1] = new Square();

        // Проходим по массиву и полиморфно вызываем метод printType()
        for (Shape shape : canvas) {
            shape.printType(); // каждая фигура печатает своё имя
        }
    }
}
