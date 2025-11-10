package Old_Javarush.Syntax.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture5_2 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }
}
