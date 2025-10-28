package JAVA25.Level19_Abstract;

public class Lecture2_3 {
    static void main(String[] args) {
        Circle circle = new Circle("Круг", 2.5);
        System.out.println(circle.name);
        System.out.println(circle.area());
    }
    static abstract class Shape{
        public String name;

        public Shape(String name) {
            this.name = name;
        }
        public abstract double area();
    }

    static class Circle extends Shape {
        double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double area() {
          return   Math.PI * radius * radius;
        }
    }
}

