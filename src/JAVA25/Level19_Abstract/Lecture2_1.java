package JAVA25.Level19_Abstract;

public class Lecture2_1 {
    static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

    }
    static abstract class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Гав!");
        }
    }
}


