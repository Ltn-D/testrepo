package Izuchaem_Java.FloodTheSite;

import java.util.ArrayList;

public class DotComGame {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;


     private void SetupGame() {
        DotCom site1 = new DotCom();
        DotCom site2 = new DotCom();
        DotCom site3 = new DotCom();
        site1.setName("Pets.com");
        site2.setName("Go2.com");
        site3.setName("Toys.com");
        dotComList.add(site1);
        dotComList.add(site2);
        dotComList.add(site3);
        System.out.println("Выша цель потопить 2 сайта:\n" + site2.getName()
                + ", " + site2.getName() + ", " + site3.getName());
        System.out.println("Потратьте минимальное количество ходов");
        for (DotCom dotCom : dotComList) {
            ArrayList<String> location = helper.plaseDotCom(3);
            dotCom.setLocalCells(location);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Ваш ход:");
            cherYserGuess(userGuess);

        }
        finishGame();

    }

    private void cherYserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotCom : dotComList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("Попал") ) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Вы потопили все сайты");
        System.out.println("Потрачено " + numOfGuesses + " попыток");
    }

    static void main(String[] args) {
        DotComGame game = new DotComGame();
        game.SetupGame();
        game.startPlaying();
    }
}
