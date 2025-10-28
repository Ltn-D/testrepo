package JAVA25.Level20_interfaces;

import java.util.function.Predicate;

public class Lecture4_3 {
    static void main(String[] args) {

        String str1 = "Java";
        String str2 = "FunctionalInterface";
        print(str1);
        print(str2);

        }

    static void print(String s) {
        Predicate<String> isLength = str -> s.length() > 5;
        System.out.println(isLength.test(s));
    }
}
