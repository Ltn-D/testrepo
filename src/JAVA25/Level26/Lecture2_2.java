package JAVA25.Level26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture2_2 {
    static void main() {
        List<String> films = new ArrayList<>(Arrays.asList("Титаник", "Матрица", "Интерстеллар","Матрица"));
        System.out.println(films.indexOf("Матрица"));
        System.out.println(films.contains("Аватар"));
        films.clear();
        System.out.println(films);
    }
}
