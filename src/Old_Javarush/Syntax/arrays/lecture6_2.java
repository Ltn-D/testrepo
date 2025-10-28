package Old_Javarush.Syntax.arrays;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class lecture6_2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        multiArray =new int[N][];
        for (int i = 0; i < multiArray.length; i++) {
            int length = console.nextInt();
            multiArray[i] = new int[length];

        }
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(multiArray[i].length);
        }
    }
}
