package Izuchaem_Java.FloodTheSite;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> localCells;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalCells(ArrayList<String> localCells) {
        this.localCells = localCells;
    }
    public String checkYourself(String userGuess) {
        String result = "Мимо";
        if (localCells.contains(userGuess)){
            localCells.remove(userGuess);
            if (localCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
