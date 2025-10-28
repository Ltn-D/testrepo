package JAVA25.Level21_Lambda;

public class Lecture4_2 {
    static interface Printer {
        void print(String text);

        static void printHello(Printer printer) {
            printer.print ("Hello, world!");
        }
    }

    static class Consoleprinter implements Printer {
        @Override
        public void print(String text) {
            System.out.println(text);
        }
    }

    static void main(String[] args) {
        Printer printer = new Consoleprinter();
        Printer.printHello(printer);
    }

}
