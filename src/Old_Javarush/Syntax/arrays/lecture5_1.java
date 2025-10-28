package Old_Javarush.Syntax.arrays;

public class lecture5_1 {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-3s", i * j + " ");
            }
            System.out.println();

        }

    }
}
