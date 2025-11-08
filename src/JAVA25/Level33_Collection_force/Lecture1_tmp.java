package JAVA25.Level33_Collection_force;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Lecture1_tmp {
    static void main(String[] args) {
        List<Long> l1 = LongStream.range(0,10_000_000)
                .boxed()
                .collect(Collectors.toList());
        long t1 =System.currentTimeMillis();
        long sun = l1.stream().mapToLong(x -> x).sum();
        long t2 = System.currentTimeMillis();
        System.out.println(sun);
        System.out.println(t2-t1);
        t1 = System.currentTimeMillis();
        long sum2 = LongStream.range(0, 10_000_000).sum();
        t2 = System.currentTimeMillis();
        System.out.println(sum2);
        System.out.println(t2-t1);


    }
}
