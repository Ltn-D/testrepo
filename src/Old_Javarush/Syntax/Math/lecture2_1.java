package Old_Javarush.Syntax.Math;

public class lecture2_1 {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }
}
