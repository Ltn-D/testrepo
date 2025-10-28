package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;

import java.util.Collections;

public class Lecture2_3 {
    static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll((strings), "Hello", "Amigo", "Javarush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        //strings.forEach(s -> System.out.println(s));
        strings.forEach(System.out::println);
    }
}
