package Old_Javarush.Syntax.Collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lecture3_1 {
    public static void copy(ArrayList<String> destinatoin, ArrayList<String> source) {
        if (destinatoin.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        Collections.copy(destinatoin,source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }

    static void main() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Что такое хорошо и что такое плохо".split(" ")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Крошка сын к отцу пришел".split(" ")));
        copy(list1,list2);
        System.out.println(list1);
        addAll(list1, list1.getFirst());
        System.out.println(list1);
        list1 = new ArrayList<>(Arrays.asList("Что такое хорошо и что такое плохо".split(" ")));
        replaceAll(list1, "такое", "же это");
        System.out.println(list1);

    }
}
