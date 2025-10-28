package Old_Javarush.Syntax.Objekts;

public class Lecture4_2 {
    private int salary = 5000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary > salary ? newSalary : salary;
    }

    public static void main(String[] args) {
        Lecture4_2 programmer = new Lecture4_2();
        System.out.println(programmer.salary);
        programmer.setSalary(4000);
        System.out.println(programmer.salary);
        programmer.setSalary(5500);
        System.out.println(programmer.salary);
    }
}
