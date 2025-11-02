package JAVA25.Level28_Collections;

import java.util.ArrayList;
import java.util.List;

public class Lecture2_1 {
    static class Student {
        private String studentName;

        public String getStudentName() {
            return studentName;
        }

        public Student(String studentName) {
            this.studentName = studentName;
        }
    }

    static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Иван"),
                new Student("Мария"),
                new Student("Петр")
        ));
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getStudentName());
        }
        System.out.println(studentNames);
    }
}
