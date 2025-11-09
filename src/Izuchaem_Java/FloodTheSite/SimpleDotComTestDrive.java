package Izuchaem_Java.FloodTheSite;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};

        dot.setLocationCells(locations);

        String userGuess = "д";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Пройден тест на попадание";
        } else if (result.equals("Сайт уничтожен")) {
            testResult = "Пройдет тест на уничтожение сайта";
        } else if (result.equals("Мимо")) {
            testResult = "Пройден тест на промах";
        }



    }
}
