package Old_Javarush.Syntax.Collections2;

import java.util.ArrayList;
import java.util.HashMap;

public class Lecture4_4 {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages((getProgrammingLanguages())));
    }

    public static ArrayList<String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;
    }

    public static HashMap<Integer, String> getProgrammingLanguages(ArrayList<String> list) {
        HashMap<Integer, String> programmingLanguagesMap = new HashMap<>();
        for (String s : list) {
            programmingLanguagesMap.put(list.indexOf(s), s);
        }
        return programmingLanguagesMap;
    }
}
