package JAVA25.Level14_Classes;

public class Lecture5_1 {
    static void main(String[] args) {
        Animal wildAnimal = new Animal();
        System.out.println(wildAnimal.animalAge);
        System.out.println(wildAnimal.animalName);
    }
}

class Animal {
    int animalAge;
    String animalName;

}