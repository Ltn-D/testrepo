package JAVA25.Level31_Stream_group_agregation;

import java.util.Comparator;
import java.util.List;
public class Lecture1_2 {
    static class Student {
        private final String studentName;
        private final int examScore;

        public Student(String studentName, int examScore) {
            this.studentName = studentName;
            this.examScore = examScore;
        }

        public String getStudentName() {
            return studentName;
        }

        public int getExamScore() {
            return examScore;
        }
    }
    public static void main(String[] args) {
        // Создаем список студентов (неизменяемый)
        List<Student> students = List.of(
                new Student("Алиса", 90),
                new Student("Боб", 75),
                new Student("Вася", 100),
                new Student("Катя", 80)
        );

        // 1) Количество студентов с баллом > 80 (используем Stream API)
        long excellentCount = students.stream()
                .filter((s)-> s.getExamScore()>80)
                .count();

        System.out.println(excellentCount);

        // 2) Средний балл по всем студентам (если список пуст — 0.0)
        double averageScore = students.stream()
                .mapToDouble(Student::getExamScore)
                .average()
                .orElse(0.0);

        System.out.println(averageScore);

        // 3) Имя студента с минимальным баллом
        students.stream()
                .min(Comparator.comparing(Student::getExamScore))
                .ifPresent(student -> System.out.println(student.getStudentName()));

        // Если список пуст — ничего не выводим

    }



}
