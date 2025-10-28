package JAVA25.Level5;

import java.util.Scanner;

public class lecture2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println();
        int pyramidHeight = console.nextInt();
        int spaceCount = pyramidHeight;
        int symbolCount = 0;
        for (int i = 1; i <= pyramidHeight; i++) {
            spaceCount -= 1;
            //System.out.println(spaceCount);
            symbolCount = (2 * i) - 1;
            //System.out.println("*" +symbolCount);
            for (int j = spaceCount; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= symbolCount; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
