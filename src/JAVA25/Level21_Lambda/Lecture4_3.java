package JAVA25.Level21_Lambda;

public class Lecture4_3 {
    static interface MathHelper {
        default void printSquare(int n) {
            System.out.println(n * n);
        }
        static void printCube(int n) {
            System.out.println(n * n * n);
        }
    }

    static class NumberPrinter implements MathHelper {

    }

    static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.printSquare(5);
        MathHelper.printCube(3);

    }
}
