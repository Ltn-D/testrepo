package JAVA25.Level18_Polymorfizm;

public class Lecture1_2 {
    public static void main(String[] args) {
        // Массив типа Animal хранит ссылки на разные конкретные животные.
        Animal[] pen = { new Cat(), new Cow() };

        // Полиморфизм: вызывается версия makeSound() конкретного объекта,
        // даже если переменная имеет тип базового класса Animal.
        for (Animal animal : pen) {
            animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
        }
    }

    static class Animal {
        void makeSound() {
            System.out.println("Какой-то звук...");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Мяу!");
        }
    }

    static class Cow extends Animal{
        @Override
        void makeSound() {
            System.out.println("Мууу!");
        }
    }
}
