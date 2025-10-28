package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture3_4 {
    static class Animal {
        // Защищённый метод: доступен внутри класса, его наследникам и классам в том же пакете
        protected void makeSound() {
            System.out.println("Some sound");
        }
    }

    static class Dog extends Animal {
        public Dog() {
            makeSound();
        }

    }

    static class AlterDog {
        public AlterDog() {
            //makeSound();
        }
    }
}
