package JAVA25.Level33_Collection_force;

import java.util.*;
import java.util.stream.*;

public class Lecture4_tmp {
    static void main(String[] args) {
        List<Integer> nunbers = IntStream.range(0,10_000_000)
                .boxed()
                .collect(Collectors.toList());
        long t1 = System.currentTimeMillis();
        long count = nunbers.stream()
                .filter(n-> isPrime(n))
                .count();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        t1 = System.currentTimeMillis();
        count = nunbers.parallelStream()
                .filter(n->isPrime(n))
                .count();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

    public static boolean isPrime(int n) {
        if (n%2==0) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n%i == 0) return false;

        }
        return true;
    }
}
