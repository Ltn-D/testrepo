package JAVA25.Level17Extendet;

public class Lecture2_1 {
    public static void main(String[] args) {
        // Создаем объект круга и просим его нарисовать себя
        Circle circle = new Circle();
        circle.draw(); // Ожидаемый вывод: "Drawing a circle"
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
        public void draw() {
        System.out.println("Drawing a circle");
    }
}