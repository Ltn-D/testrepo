package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lecture1_TMP {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Привет как дела".split(" ")));
        //Collections.addAll(list, "Привет", "как", "дела", "?");
        Comparator<String> comparator = new Comparator<String>() {//создали объект компоратор из интерфейса
            public int compare(String obj1, String obj2) {//переопределили для него метод
                return obj1.length() - obj2.length();
            }
        };
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().charAt(0) - o2.toLowerCase().charAt(0);
            }

        };
        Comparator<String> comparator2 = (String o1,String o2)->// короткая запись, опуститили вызов метода с использованием оператора "->", можно если только 1 метод у интерфейса.
        {
            return o2.length() - o1.length();
        };
        Collections.sort(list, comparator);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("__________________");
        Collections.sort(list,comparator1);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("__________________");
        Collections.sort(list, comparator2);
        for (String s : list) {
            System.out.println(s);
        }
        Collections.sort(list,((o1, o2) -> o1.length() - o2.length())); // запись с виде лямбда выражения

    }
}
