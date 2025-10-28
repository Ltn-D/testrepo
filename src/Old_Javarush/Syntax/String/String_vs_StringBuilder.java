package Old_Javarush.Syntax.String;

public class String_vs_StringBuilder {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i + "*";
        }
        long t2 = System.currentTimeMillis();
        System.out.println("String: " + (t2 - t1) + " mc");
        t1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("*");
        }
        s = stringBuilder.toString();
        t2 = System.currentTimeMillis();
        System.out.println("String: " + (t2 - t1) + " mc");
    }
}
