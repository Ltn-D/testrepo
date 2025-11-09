package Izuchaem_Java.FloodTheSite;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuess) {
        String result = "Мимо";

        try {
            int guess = Integer.parseInt(userGuess);


        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
            if (numOfHits == locationCells.length) {
                result = "Потопил";
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка!!! Вы ввели не целое число");
        }

        return result;
    }
}
