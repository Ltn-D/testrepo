package JAVA25.Level19_Abstract.Level2_4;

public class Manager extends Employee {
    private double baseSalary;

    public Manager(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
