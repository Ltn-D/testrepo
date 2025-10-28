package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lecture1_4 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        //Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(strings,comparator);

    }
}
