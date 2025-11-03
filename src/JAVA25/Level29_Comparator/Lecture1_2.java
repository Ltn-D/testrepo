package JAVA25.Level29_Comparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Lecture1_2 {
    static class Employee {
        private String employeeName;
        private int employeeId;

        public Employee(String employeeName, int employeeId) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Employee employee = (Employee) object;
            return employeeId == employee.employeeId && Objects.equals(employeeName, employee.employeeName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(employeeName, employeeId);
        }
    }
    public static void main(String[] args) {
        // Создаём два независимых объекта с одинаковыми значениями полей
        Employee first = new Employee("Алиса", 123);
        Employee second = new Employee("Алиса", 123);

        // HashMap, где ключом выступает Employee, а значением — роль
        Map<Employee, String> roles = new HashMap<>();

        // Кладём в карту пару (ключ — первый объект, значение — "Работник")
        roles.put(first, "Работник");

        // Пытаемся получить значение по "логически равному" ключу (второй объект)
        // Это сработает только при корректных equals и hashCode
        String role = roles.get(second);

        // Ожидаемый вывод: "Работник"
        System.out.println(role);
    }
}
