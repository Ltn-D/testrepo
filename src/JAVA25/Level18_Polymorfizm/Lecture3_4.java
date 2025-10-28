package JAVA25.Level18_Polymorfizm;

public class Lecture3_4 {
    public static void main(String[] args) {
        // Создаем объект виртуального кота
        Cat cat = new Cat();
        // Просим кота издать звук (сначала общий животный, затем кошачий)
        cat.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Животное издаёт звук");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            super.makeSound();
            System.out.println("Мяу!");
        }
    }
}
