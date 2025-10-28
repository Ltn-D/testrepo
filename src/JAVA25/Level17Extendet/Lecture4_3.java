package JAVA25.Level17Extendet;

public class Lecture4_3 {
    public static void main(String[] args) {
        // Создаем самый специфичный тип в иерархии — школьника
        SchoolStudent schoolStudent = new SchoolStudent();

        // Вызываем переопределенный метод introduce()
        // Ожидаемый вывод: "Я школьник."
        schoolStudent.introduce();
    }
}

class Person1 {
    void introduce() {
        System.out.println("Я человек.");
    }
}

class Student1 extends Person1 {
}

class SchoolStudent extends Student1 {
    @Override
    void introduce() {
        System.out.println("Я школьник.");
    }
}
