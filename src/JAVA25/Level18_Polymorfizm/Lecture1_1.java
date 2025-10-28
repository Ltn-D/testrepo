package JAVA25.Level18_Polymorfizm;

public class Lecture1_1 {
    public static void main(String[] args) {
        // Переменная базового типа Animal хранит объект Dog — это и есть полиморфизм
        Animal pet = new Dog();

        // Вызов переопределенного метода: напечатает "Гав!"
        pet.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Какой-то звук...");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Гав!");
        }
    }
}
