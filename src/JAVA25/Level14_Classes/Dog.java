package JAVA25.Level14_Classes;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    static void main() {
        Dog sharik = new Dog("Шарик", 5);
        System.out.println("Собаку зовут " + sharik.dogName + ", ей " + sharik.dogAge + " лет");
    }
}
