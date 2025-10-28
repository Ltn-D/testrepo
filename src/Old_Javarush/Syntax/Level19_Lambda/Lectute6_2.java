package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Lectute6_2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
        list.forEach(s -> {
            Optional<String> str = Optional.ofNullable(s);
            System.out.println(str.orElse(text));
        });
    }
}
