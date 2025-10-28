package JAVA25.Level16_Inner_Nested;

import java.util.Scanner;

public class Lecture4_4 {
   public void generateNameReport(String customerName) {
       class NameStatistics {
           String originalCustomerName;

           public NameStatistics(String originalCustomerName) {
               this.originalCustomerName = originalCustomerName;
           }
           void printUpperCaseName() {
               System.out.println(originalCustomerName.toUpperCase());
           }
           void printNameLength() {
               System.out.println(originalCustomerName.length());
           }
       }
       NameStatistics nameStatistics = new NameStatistics(customerName);
       nameStatistics.printUpperCaseName();
       nameStatistics.printNameLength();
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        Lecture4_4 tst = new Lecture4_4();
        tst.generateNameReport(customerName);

    }
}
