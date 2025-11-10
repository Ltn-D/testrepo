package JAVA25.Level21_Lambda;

public class Lecture4_2 {
    static interface Printer {
        void print(String text);

        static void printHello(Printer printer) {
            printer.print ("Hello, world!");
        }
    }

    static class ConsolePrinter implements Printer {
        @Override
        public void print(String text) {
            System.out.println(text);
        }
    }

    static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Printer.printHello(printer);
    }

}
