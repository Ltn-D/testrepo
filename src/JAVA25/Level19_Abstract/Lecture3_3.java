package JAVA25.Level19_Abstract;

public class Lecture3_3 {
    public static void main(String[] args) {
        // Создаём менеджера "Ivan" с зарплатой 50000
        Manager manager = new Manager("Ivan", 50000);

        // Сначала выводим имя, затем зарплату
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
    }

    static abstract class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public abstract double getSalary();
    }

    static class Manager extends Employee {
        double salary;

        public Manager(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        @Override
        public double getSalary() {
            return salary;
        }
    }
}
