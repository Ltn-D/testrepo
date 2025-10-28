package JAVA25.Level17Extendet.Lecture3_3;

public class Animal {
    String name = "Животное";
}

class Cat extends Animal{
    String name = "Кошка";
    void printNames() {
        System.out.println("Имя из Cat: " + name);
        System.out.println("Имя из Animal: " + super.name);
    }
}
