package JAVA25.Level21_Lambda;

import java.util.function.Function;

public class Lecture1_TMP {
    static void main(String[] args) {
        Runnable r = () -> System.out.println("TST");
        r.run();
        System.out.println(sum.apply(5, 6));
        Operation newSum = ((a, b) -> a + b);
        System.out.println(newSum.apply(6,5));
        Operation multi = (a, b) -> a * b;
        System.out.println(multi.apply(2,3));
        Function<Integer, String> func = x -> "SSS" + x;
        System.out.println(func.apply(6));
        System.out.println(Counter.printSum(1));;
    }
    @FunctionalInterface
    static interface Operation {
        int apply(int a, int b);
    }
    static Operation sum = new Operation() {
        @Override
        public int apply(int a, int b) {
           return a + b;
        }
    };

    static class Counter {
        static private int base = 10;
        public static int printSum(int x){
        Function<Integer, Integer> summ = y -> base + y + x;
            //System.out.println(summ.apply(2));
            return summ.apply(2);
        }

    }

}
