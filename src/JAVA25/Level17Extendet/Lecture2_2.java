package JAVA25.Level17Extendet;

public class Lecture2_2 {
    public static void main(String[] args) {
        // Создаем собаку и просим подать голос
        Dog dog = new Dog();
        dog.makeSound(); // Должно вывести "Woof!"
    }
}

class Animal2 {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
