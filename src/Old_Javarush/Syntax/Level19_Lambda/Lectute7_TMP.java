package Old_Javarush.Syntax.Level19_Lambda;

import java.util.Optional;

public class Lectute7_TMP {
    static void main(String[] args) {
        String string = null;
        String string1 = "dfgdfag";
        Optional<String> str = Optional.ofNullable(string);
        System.out.println(str);
        System.out.println(string);
        System.out.println(str.orElse(string1));
        //System.out.println(str.get());
        //System.out.println(str.orElseThrow());
        System.out.println(str.isPresent());
        System.out.println(str.isEmpty());
    }
}
