package JAVA25.Level12;

import java.util.HashMap;

public class Lecture2_1 {
    static void main(String[] args) {
        HashMap<String, String> travelPhraseBook = new HashMap<>();
        travelPhraseBook.put("дом", "house");
        System.out.println(travelPhraseBook.get("дом"));
    }
}
