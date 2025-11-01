package JAVA25.Level6;

import java.util.Scanner;

public class Lecture2_2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double customerPayment = scanner.nextDouble();
        scanner.close();
        System.out.println("Внесено средств: " + customerPayment);
    }
}
