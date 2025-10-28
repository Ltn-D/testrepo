package JAVA25.Level21_Lambda;

import java.util.function.Consumer;

public class Lecture2_2 {
    static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("Hello, method reference!");
    }
}
