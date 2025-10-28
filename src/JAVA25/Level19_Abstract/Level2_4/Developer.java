package JAVA25.Level19_Abstract.Level2_4;

public class Developer extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Developer(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
