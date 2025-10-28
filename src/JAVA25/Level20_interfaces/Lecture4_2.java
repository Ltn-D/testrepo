package JAVA25.Level20_interfaces;

public class Lecture4_2 {
    static void main(String[] args) {
        NumberChecker checker = n -> n > 100;
        System.out.println(checker.check(50));
        System.out.println(checker.check(150));
    }

    @FunctionalInterface
    interface NumberChecker {
        boolean check(int n);
    }

}
