package Old_Javarush.Syntax.arrays;

public class lecture1_3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
            System.out.println(array[i]);

        }


    }
}
