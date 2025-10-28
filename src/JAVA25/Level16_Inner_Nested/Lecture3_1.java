package JAVA25.Level16_Inner_Nested;

public class Lecture3_1 {
    static class MagicalCreature {
        void makeSound() {
            System.out.println("Существо издаёт звук");
        }
    }

    static void main(String[] args) {
        MagicalCreature creature = new MagicalCreature() {
            @Override
            void makeSound() {
                System.out.println("Ква-ква!");
            }
        };
        creature.makeSound();
    }
}
