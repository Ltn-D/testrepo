package JAVA25.Level20_interfaces;

public class Lecture1_4 {
    interface Soundable {
        void makeSound();
    }

    static class Dog implements Soundable{
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    static class Cat implements Soundable {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    static void main(String[] args) {
        Soundable[] zoo = new Soundable[2];
        zoo[0] = new Dog();
        zoo[1] = new Cat();
        for (Soundable animal : zoo) {
            animal.makeSound();
        }
    }

}
