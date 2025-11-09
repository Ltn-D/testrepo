package Izuchaem_Java.FloodTheSite;

import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {
    static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom dot = new SimpleDotCom();
        Random random = new Random();
        int start = random.nextInt(4);
        int [] locations = {start,start+1,start+2};
        dot.setLocationCells(locations);
        System.out.println("Введите целое число от 0 до 6");
        Scanner scanner = new Scanner(System.in);
        while (dot.getNumOfHits() < locations.length) {
            String userGuess = scanner.nextLine();
            System.out.println(dot.checkYourself(userGuess));
            numOfGuesses++;
        }
        System.out.printf("Вам потребовалось %d попыток(и)",numOfGuesses);

    }
}
