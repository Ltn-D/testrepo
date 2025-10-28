package JAVA25.Level20_interfaces;

public class Lecture1_3 {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printPi();
    }

    interface MathConstants {
        double PI = 3.14159;
    }

    static class Calculator implements MathConstants{
        void printPi() {
            System.out.println(PI);
        }
    }

}
