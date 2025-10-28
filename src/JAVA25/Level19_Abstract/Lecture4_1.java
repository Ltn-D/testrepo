package JAVA25.Level19_Abstract;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Создаём круг радиуса 2.0
        Circle circle = new Circle(2.0);

        // Выводим площадь. Ожидаем увидеть 12.56
        System.out.println(circle.area());
    }

    static abstract class Shape {
        public abstract double area();
    }

    static class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI*radius*radius;
        }
    }
}
