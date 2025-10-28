package JAVA25.Level21_Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1_3 {
    static void main(String[] args) {
        List<Integer> results = new ArrayList<>(Arrays.asList(-5, 3, -2, 7, 0));
        Comparator<Integer> cmp = (a, b) -> Math.abs(a) - Math.abs(b);
        results.stream()
                .sorted(cmp)
                .forEach(System.out::println);


    }
}
