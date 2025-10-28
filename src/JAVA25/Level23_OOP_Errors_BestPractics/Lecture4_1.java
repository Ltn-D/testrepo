package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture4_1 {
    static abstract class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Гав!");
        }
    }

    static void main() {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
