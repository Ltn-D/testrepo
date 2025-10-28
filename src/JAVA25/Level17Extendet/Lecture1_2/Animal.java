package JAVA25.Level17Extendet.Lecture1_2;

public class Animal {
    String petName;

    void sleep() {
        System.out.println(petName + " спит.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(petName + " говорит: Гав!");
    }
}
