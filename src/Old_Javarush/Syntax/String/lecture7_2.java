package Old_Javarush.Syntax.String;

public class lecture7_2 {
    public static void main(String[] args) {
        String string = "Ходит кот Задом на перед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder result = new StringBuilder(string);
        return result.reverse().toString();
    }

}
