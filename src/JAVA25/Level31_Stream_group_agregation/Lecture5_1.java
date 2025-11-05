package JAVA25.Level31_Stream_group_agregation;

import Old_Javarush.Core.Level5_overload.Lecture8_11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lecture5_1 {
    static class Student {
        private final String name;
        private final double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getStudentName() {
            return name;
        }

        public double getStudentGpa() {
            return gpa;
        }
    }
    public static void main(String[] args) {
        // Создаем и заполняем список абитуриентов (имя + GPA)
        List<Student> candidates = List.of(
                new Student("Алиса", 3.7),
                new Student("Борис", 2.8),
                new Student("Чен", 3.0),
                new Student("Дина", 2.4),
                new Student("Егор", 4.0)
        );

        // Разделяем на две группы по критерию GPA >= 3.0:
        Map<Boolean, List<String>> byGpaPartition = candidates.stream()
                .collect(Collectors.partitioningBy(student -> student.getStudentGpa() >= 3,
                        Collectors.mapping(Student::getStudentName, Collectors.toList())));


        // - partitioningBy выполняет разбиение на true/false
        // - mapping вытаскивает из Student только имена (String), собирая их в списки


        // Выводим полученную карту: {true=[имена с GPA >= 3.0], false=[остальные]}
        System.out.println(byGpaPartition);
    }
}
