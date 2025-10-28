package Old_Javarush.Syntax.Collections2;

import java.util.*;

public class Lecture2_1 {
    static void printList(ArrayList<String> words) {
        for (String s : words) {
            System.out.println(s);
        }
    }

    static void printHashset(HashSet<String> words) {
        for (String s : words) {
            System.out.println(s);
        }
    }
    static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashset = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("________________________");
        printHashset(wordsHashset);
    }
}
