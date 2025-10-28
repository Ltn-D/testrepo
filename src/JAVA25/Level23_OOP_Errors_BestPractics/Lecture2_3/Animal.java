package JAVA25.Level23_OOP_Errors_BestPractics.Lecture2_3;

public class Animal {
    private final String name;

    // Конструктор, принимающий имя животного
    // В классе нет конструктора без параметров, чтобы нельзя было создать животное без имени
    public Animal(String petName) {
        this.name = petName;
    }

    // Геттер для получения имени животного
    public String getName() {
        return name;
    }
}
