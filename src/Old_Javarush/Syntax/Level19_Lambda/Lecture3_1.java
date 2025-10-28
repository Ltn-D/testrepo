package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lecture3_1 {
    static void main(String[] args) {
        var strings = new ArrayList<String>(Arrays.asList("Зима Весна Лето Осень".split(" ")));
        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{1, 2, 3, 4, 5, 6, 88};
        //Collections.addAll(integers, 1, 2, 3, 4, 5, 6, 88);
        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach((System.out::println));

    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> strings) {
        return strings.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] integers) {
        return Arrays.stream(integers);
    }
}
