package Old_Javarush.Syntax.Level19_Lambda;

import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;


public class Lecture7_2 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.filter(s -> s.length() >6)
                .collect(toSet());
    }
}
