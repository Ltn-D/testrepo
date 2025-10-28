package Old_Javarush.Syntax.arrays;

import java.util.Scanner;

public class lecture2_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количесво элементов :");
        int N = console.nextInt();
        if (N < 0) {
            System.out.println("Введите число больше 0");
            return;}
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        if (N % 2 == 0) {
            for (int elem : array) {
                System.out.println(elem);
            }
        } else {
            for (int i = N-1; i >= 0 ; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
