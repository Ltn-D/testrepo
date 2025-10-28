package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture5_3 {
    public static final double INCOME_TAX_RATE = 0.13;

    static void main(String[] args) {
        double employeeSalary = 5000.0;
        double calculatedTax = employeeSalary * INCOME_TAX_RATE;
        System.out.println(calculatedTax);
    }
}
