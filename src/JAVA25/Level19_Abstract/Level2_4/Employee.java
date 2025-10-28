package JAVA25.Level19_Abstract.Level2_4;

public abstract class Employee {
    private String name;

    public abstract double getSalary();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
