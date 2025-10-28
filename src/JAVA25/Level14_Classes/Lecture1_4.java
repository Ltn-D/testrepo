package JAVA25.Level14_Classes;

public class Lecture1_4 {
    static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "Анна";
        student1.enrollmentYear = 2022;
        Student student2 = new Student();
        student2.studentName = "Иван";
        student2.enrollmentYear = 2023;
        System.out.println("Имя: " + student1.studentName + ", год поступления: " + student1.enrollmentYear);
        System.out.println("Имя: " + student2.studentName + ", год поступления: " + student2.enrollmentYear);

    }

}

class Student {
    String studentName;
    int enrollmentYear;
}
