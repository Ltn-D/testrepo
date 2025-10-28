package JAVA25.Level21_Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Lecture2_3 {
    static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("яблоко", "банан", "груша"));
        fruits.sort(String::compareTo);
        fruits.forEach(System.out::println);


    }
}
