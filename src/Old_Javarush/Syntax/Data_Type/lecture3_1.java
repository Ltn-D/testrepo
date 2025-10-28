package Old_Javarush.Syntax.Data_Type;

public class lecture3_1 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(10000000000l);

    }

    public static void setValues(long values) {
        a = (byte) values;
        b = (short) values;
        c = (int) values;
        d = values;
        System.out.println(a + " " + b +" " + c + " " +d);

    }
}
