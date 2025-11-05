package JAVA25.Level31_Stream_group_agregation;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lecture4_tmp {
    static class Employee {
        private String name;
        private String department;
        private String position;
        private int salary;
        // ... конструкторы, геттеры, toString

        public Employee(String name, String department, String position, int salary) {
            this.name = name;
            this.department = department;
            this.position = position;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getPosition() {
            return position;
        }

        public int getSalary() {
            return salary;
        }
    }

    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Иван", "ИТ", "Разработчик", 120_000),
                new Employee("Мария", "ИТ", "Тестировщик", 90_000),
                new Employee("Пётр", "HR", "Менеджер", 80_000),
                new Employee("Ольга", "ИТ", "Разработчик", 130_000),
                new Employee("Светлана", "HR", "Рекрутер", 70_000)
        );
        Map<String, Map<String, List<Employee>>> byDepartmentPosition = employees.stream()//получили карту, в которой ключем является отдел, а значением карта, ключем в которой является роль
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(
                                Employee::getPosition
                        )
                ));
        List<String> developers = byDepartmentPosition//сохранили имена разработчиков в список
                .getOrDefault("ИТ",Map.of())
                .getOrDefault("Разработчик", List.of())
                .stream()
                .map(Employee::getName)
                .toList();
        System.out.println(byDepartmentPosition// просто распечатали имена разработчиков
                .getOrDefault("ИТ",Map.of())
                .getOrDefault("Разработчик", List.of())
                .stream()
                .map(Employee::getName)
                .toList());

        Map<String, Map<String, Optional<Employee>>> byDepartmentPositionMinSalary = employees.stream()//для каждой роли найдем минимальную з/п
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(
                                Employee::getPosition,
                                Collectors.minBy(Comparator.comparing(Employee::getSalary))
                        )
                ));
        for (var depEntry : byDepartmentPositionMinSalary.entrySet()) {
            String department = depEntry.getKey();
            Map<String, Optional<Employee>> positions = depEntry.getValue();
            for (var posEntry : positions.entrySet()) {
                String position = posEntry.getKey();
                int emps = posEntry.getValue().get().getSalary();
                System.out.println(department + " " + position + " " + emps);


            }
        }
        }


    }
