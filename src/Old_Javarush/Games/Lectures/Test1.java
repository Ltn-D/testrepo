package Old_Javarush.Games.Lectures;

import com.javarush.engine.cell.Color;

public class Test1 {
    static void main(String[] args) {
        FirstGame game1 = new FirstGame();
        game1.initialize();
        FigureView figureView = new FigureView();
        figureView.initialize();
        String word = "JAVARUSH";
        for (int i = 0; i < 8; i++) {
            System.out.println(String.valueOf(word.charAt(i)));
        }
    }

}
