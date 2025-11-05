package JAVA25.Level31_Stream_group_agregation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lecture3_tmp {
    static class Employee {
        private final String name;
        private final String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Алиса", "IT"),
                new Employee("Боб", "HR"),
                new Employee("Клара", "IT"),
                new Employee("Денис", "Finance"),
                new Employee("Ева", "HR")
        );
        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment));
        byDepartment.forEach((key, employeer)->
                System.out.println(key + ": " + employeer.stream().map(Employee::getName).toList()));
        Map<Boolean, List<Employee>> itDepartment = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getDepartment().equals("IT")));
        System.out.println("IT Department: " + itDepartment.get(true).stream().map(Employee::getName).toList());
        System.out.println("Other Department: " + itDepartment.get(false).stream().map(Employee::getName).toList());

    }
}
