package JAVA25.Level18_Polymorfizm;

public class Leture4_1 {
    static void main() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

    }
    static class Animal {
        void makeSound() {
            System.out.println("Животное издает звук");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Кошка мяукает");
        }
    }

    static class Dog extends Animal{
        @Override
        void makeSound() {
            System.out.println("Собака лает");
        }
    }
}


