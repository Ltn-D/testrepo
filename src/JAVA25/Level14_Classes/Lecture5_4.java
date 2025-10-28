package JAVA25.Level14_Classes;

public class Lecture5_4 {
    static void main(String[] args) {
        Students newStudent = new Students();
    }
}

class Students {
    int studentGrade = 1;
    {
        System.out.println("Блок 1: grade = " + studentGrade);
        studentGrade = 5;
    }
    {
        System.out.println("Блок 2: grade = " + studentGrade);
    }
}
