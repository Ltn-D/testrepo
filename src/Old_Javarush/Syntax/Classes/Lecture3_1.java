package Old_Javarush.Syntax.Classes;

public class Lecture3_1 {
    public static void main(String[] args) {
        String string = "12.84";
        double d = Double.parseDouble(string);
        long i = Math.round(d);
        System.out.println(i);
    }
}
