package Old_Javarush.Syntax.functios;
import java.util.Arrays;
public class reverse_func {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        array = reverseArray(array); // нужно присвоение, т.к. в итоге reverseArray(array) создается новый массив, а не изменияется старый
        System.out.println(Arrays.toString(array));
    }
    static int[] reverseArray (int[] array) {
        int[] array1 = new int[array.length];//{2, 3, 4, 5, 6};
        //array1 = array;
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            array1[i] = array[j];
        }
        //System.out.println(Arrays.toString(array) + Arrays.toString(array1));
        array = array1;
        //System.out.println(Arrays.toString(array));
        return array;
    }

}
