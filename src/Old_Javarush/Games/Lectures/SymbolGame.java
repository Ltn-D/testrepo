package Old_Javarush.Games.Lectures;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

public class SymbolGame extends Game {
    @Override
    public void initialize() {
        String word = "JAVARUSH";
        setScreenSize(8, 3);
        for (int i = 0; i < 8; i++) {
            setCellValueEx(i, 1, Color.ORANGE, String.valueOf(word.charAt(i)));
        }
    }
}
