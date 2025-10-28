package JAVA25.Level17Extendet.Lecture3_1;

public class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Собака лает");
    }
}
