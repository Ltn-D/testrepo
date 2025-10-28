package JAVA25.Level19_Abstract.Level2_4;

public class Solution {
    static void main(String[] args) {
        Employee[] staff = new Employee[]{new Manager("Анна", 100000), new Developer("Иван", 500, 160)};

        for (Employee s : staff) {
            System.out.println("Имя: " + s.getName() + ", зарплата: " + s.getSalary());
        }

    }


}
