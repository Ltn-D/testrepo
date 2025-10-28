package Old_Javarush.Syntax.Collections2;

import java.util.Iterator;
import java.util.ArrayList;



public class Lecture2_3 {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {//c помощью fori
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().equals("bug")) {
                list.remove(i);
                i -= 1;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {//с помощью iterator и while
        //напишите тут ваш код
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equalsIgnoreCase("bug")) {//лучше сравнивать так
                iter.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {//с помощью for-each и копии листа
        ArrayList<String> tmp = new ArrayList<>(list);
        for (String s : tmp) {
            if (s.toLowerCase().equals("bug")) {
                list.remove(s);
            }
        }
        //напишите тут ваш код
    }

}
