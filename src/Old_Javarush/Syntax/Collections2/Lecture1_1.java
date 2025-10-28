package Old_Javarush.Syntax.Collections2;

import java.util.HashSet;

public class Lecture1_1 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("____________________________________________");
        HashSet<String> hashSet = arrayToHashset(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashset(String[] strings) {
        HashSet<String> tmp = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            tmp.add(strings[i]);
        }

        return tmp;

    }
}
