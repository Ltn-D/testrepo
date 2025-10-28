package JAVA25.Level16_Inner_Nested;

public class Lecture4_3 {
    static void main(String[] args) {
        SpecialCalculator calculator = new SpecialCalculator();
        calculator.calculateAndDisplaySum(7, 13);
    }
}

class SpecialCalculator {
    void calculateAndDisplaySum(int numA, int numB) {
        class SumResultPrinter {
            void printResult() {
                System.out.println(numA + numB);
            }
        }
        SumResultPrinter sum = new SumResultPrinter();
        sum.printResult();
    }
}
