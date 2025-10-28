package JAVA25.Level17Extendet;

public class Lecture5_3 {
    public static void main(String[] args) {
        // Создаем объект Student.
        // Порядок вывода:
        // 1) Сначала сработает конструктор Person (через super), затем
        // 2) Конструктор Student.
        Student elena = new Student("Елена");
    }
}

class Person {
    String humanName;

    public Person(String humanName) {
        this.humanName = humanName;
        System.out.println("Person создан: " + humanName);
    }
}

class Student extends Person{
    public Student(String humanName) {
        super(humanName);
        System.out.println("Student создан: " + humanName);
    }
}
