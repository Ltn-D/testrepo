package JAVA25.Level17Extendet;

public class Lecture3_TMP {
    static void main(String[] args) {
        Cat cat = new Cat("Мурка");

    }
}

class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
        System.out.println("Животное " + name);
    }
}

class Cat extends Animal1 {
    Cat(String name) {
        super(name);
        System.out.println("Cat: " + name);
    }
}