package Old_Javarush.Syntax.Level19_Lambda;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Lecture7_4 {
    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        return  stringStream.collect(joining(" "));

    }
}
