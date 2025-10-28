package Old_Javarush.Syntax.Collections2;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Lecture1_2 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бу не выбирал".split(" ")));

    static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }

    }
    static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
