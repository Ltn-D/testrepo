package Old_Javarush.Syntax.functios;

public class lecture5_1 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);

    }
    public static void printSqrt(int [] array) {
        String elementSqrtStr = "Корень квадратный из ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtStr + element + "=" + elementSqrt);
        }
    }
}
