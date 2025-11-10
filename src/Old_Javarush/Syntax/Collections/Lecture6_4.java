package Old_Javarush.Syntax.Collections;

import java.util.ArrayList;

public class Lecture6_4 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
                add("Так");
                add("тоже");
                add("можно");
                add("делать");
                add("!");
            }};
    }
}
