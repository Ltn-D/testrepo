package JAVA25.Level18_Polymorfizm;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Создаем объект собаки — нашего обитателя зоопарка
        Dog dog = new Dog();

        // Просим собаку издать звук.
        // Должен быть выведен переопределенный вариант: "Гав!"
        dog.makeSound();
    }
    static class Animal {
        void makeSound() {
            System.out.println("Животное издаёт звук");
        }
    }

   static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Гав!");
        }
    }

}
