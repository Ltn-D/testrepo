package Old_Javarush.Syntax.arrays;

import java.util.Arrays;

public class lecture8_4 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, element);
        System.out.println(index);
    }
}
