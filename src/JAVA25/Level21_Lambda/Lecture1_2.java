package JAVA25.Level21_Lambda;

import java.util.Locale;
import java.util.function.Consumer;

public class Lecture1_2 {
    static void main(String[] args) {
        Consumer<String> newStr = s -> System.out.println(s.toUpperCase());
        newStr.accept("java");

        TextHandler newStr1 = s1 -> s1.toUpperCase();
        System.out.println( newStr1.toUpper("test"));
        TextHandler neStr2 = String::toUpperCase;
        System.out.println(neStr2.toUpper("tst2"));

    }

    @FunctionalInterface
    static interface TextHandler {
        String toUpper(String string);
    }
}
