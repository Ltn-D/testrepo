package Old_Javarush.Syntax.functios;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[array.length];
        System.out.println(Arrays.toString(array));
        //reverseArray(array);
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            array1[i] = array[j];
        }
        System.out.println(Arrays.toString(array1));
        array = array1;
        System.out.println(Arrays.toString(array));

    }
}
