package JAVA25.Level25_Git;

public class Lecture3_1 {
    public static void main(String[] args) {
        Shape shape; // Переменная базового типа (полиморфизм)

        // Один и тот же тип ссылки указывает на разные объекты и вызывает "свою" реализацию
        shape = new Square(5); // квадрат со стороной 5
        System.out.println("Площадь квадрата: " + shape.calculateSurface());

        shape = new Circle(3); // круг с радиусом 3
        System.out.println("Площадь круга: " + shape.calculateSurface());
    }

    static abstract class Shape {

        public abstract double calculateSurface();
    }

    static class Square extends Shape {
        private int sideLength;

        public Square(int sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public double calculateSurface() {
            return sideLength * sideLength;
        }
    }

    static class Circle extends Shape {
        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        @Override
        public double calculateSurface() {
            return radius * Math.PI * radius;
        }
    }
}
