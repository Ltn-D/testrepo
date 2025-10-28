package Old_Javarush.Syntax.Level19_Lambda.Lecture4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {
    static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));
        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);


    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {

        return languages.stream()
                .sorted((l1,l2)->Double.compare(l2.getRanking(), l1.getRanking()));
    }
}
