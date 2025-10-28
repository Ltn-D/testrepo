package JAVA25.Level17Extendet;

public class Lecture1_4 {
    static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();

        // Задаем цвета для каждого фрукта (поле унаследовано от Fruit)
        apple.fruitColor = "красный";
        banana.fruitColor = "жёлтый";

        // Выводим цвет каждого фрукта
        apple.printColor();
        banana.printColor();
    }
}

class Fruit {
    String fruitColor;
    void printColor() {
        System.out.println("Цвет: " + fruitColor);
    }
}

class Apple extends Fruit{
}

class Banana extends Fruit {
}