package JAVA25.Level20_interfaces;

public class Lecture4_1 {
    static void main(String[] args) {
        MessagePrinter printer = message -> System.out.println(message);
        printer.print("zdfbgzdfg");

    }
    @FunctionalInterface
    interface MessagePrinter {

        void print(String message);
    }
}
