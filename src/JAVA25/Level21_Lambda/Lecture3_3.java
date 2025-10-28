package JAVA25.Level21_Lambda;

public class Lecture3_3 {
    static interface Printer {
        void print(String message);
        default void printTwice(String message) {
            print(message);
            print(message);
        }
    }

    static class ConsolePrinter implements Printer {
        @Override
        public void print(String message) {
            System.out.println(message);
        }
    }

    static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        printer.printTwice("Java");
    }
}
