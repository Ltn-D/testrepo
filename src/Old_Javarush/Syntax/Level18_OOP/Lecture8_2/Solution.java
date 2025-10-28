package Old_Javarush.Syntax.Level18_OOP.Lecture8_2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();
    static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Organ());
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());

    }

    public static void playOrchestra() {
        for (MusicalInstrument musicalInstrument : orchestra) {
//            if (musicalInstrument instanceof MusicalInstrument) {
//                MusicalInstrument instrument = (MusicalInstrument) musicalInstrument;
//                instrument.play();
//            }
            musicalInstrument.play();
        }//напишите тут ваш код
    }

}
