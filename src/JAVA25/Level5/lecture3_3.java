package JAVA25.Level5;

import java.util.Random;
import java.util.Scanner;


public class lecture3_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // 1..100
        Scanner console = new Scanner(System.in);
        //System.out.println(secret);
        // Игра с духом
        while (true) {
            int number = console.nextInt();
            if (number < secret) {
                System.out.println("Больше!");
            } else if (number > secret) {
                System.out.println("Меньше!");
            } else {
                System.out.println("Верно!");
                break;
            }

        }
    }
}
