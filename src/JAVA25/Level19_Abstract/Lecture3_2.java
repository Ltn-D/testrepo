package JAVA25.Level19_Abstract;

public class Lecture3_2 {
    public static void main(String[] args) {
        // Создаем объекты конкретных фигур
        Figure square = new Square(4); // квадрат со стороной 4
        Figure circle = new Circle(3); // круг с радиусом 3

        // Вызываем area() у каждой фигуры и выводим результат
        System.out.println(square.area());
        System.out.println(circle.area());
    }

    static abstract class Figure {
        abstract double area();
    }

    static class Square extends Figure {
        double side;

        public Square(int side) {
            this.side = side;
        }

        @Override
        double area() {
            return side * side;
        }
    }

    static class Circle extends Figure {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius *radius;
        }
    }
}
