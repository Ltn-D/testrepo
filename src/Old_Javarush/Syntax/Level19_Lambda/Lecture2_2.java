package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture2_2 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);

    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));

        }
    }
}
