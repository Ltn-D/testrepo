package JAVA25.Level5;

import java.util.Random;
import java.util.Scanner;

public class lecture4_1 {
    public static void main(String[] args) {
        // Случайное начальное число камней 1..100
        Random rand = new Random();
        int stones = rand.nextInt(100) + +1;

        Scanner sc  = new Scanner(System.in);
        System.out.println(("Старт игры. В куче " + stones + " камней."));
        // Основной цикл партии
        while (stones >0) {
            // Ход игрока: вводим, пока не попадём в допустимый диапазон (1-10 ,но не больше, чем осталось в куче)
            int maxTake = Math.min(10, stones);
            int takePlayer;
            while (true) {
                System.out.println("Сколько камней возьмёте (1-" + maxTake + "): ");
                takePlayer = sc.nextInt();
                if (takePlayer >= 1 && takePlayer <= maxTake) {
                    break;
                }
            }
            stones -= takePlayer;
            System.out.println("Игрок взял " + takePlayer + ". Осталось: " + stones);
            if (stones == 0) {
                System.out.println("Вы победили!");
                break;
            }
            // Ход компьютера: берём случайно, но не больше остатка
            int takeBot = Math.min(stones,rand.nextInt(10)+1);
            stones -= takeBot;
            System.out.println("Компьютер взял " + takeBot + ". Осталось: " + stones);
            if (stones == 0) {
                System.out.println("Компьютер победил!");
                break;
            }

        }



    }

}
