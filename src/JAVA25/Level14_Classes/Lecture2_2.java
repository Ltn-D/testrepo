package JAVA25.Level14_Classes;

public class Lecture2_2 {
    static class Student {
        private String studentName;
        private int studentGrade;

        public Student(String studentName, int studentGrade) {
            this.studentName = studentName;
            this.studentGrade = studentGrade;
        }

        @Override
        public String toString() {
            return "Имя: " + studentName + ", оценка: " + studentGrade;
        }
    }

    static void main(String[] args) {
        Student student1 = new Student("Василий", 5);
        System.out.println(student1);
    }
}
