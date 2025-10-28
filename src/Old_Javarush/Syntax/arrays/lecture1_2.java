package Old_Javarush.Syntax.arrays;

public class lecture1_2 {
    public static final String ODD = "Чётный";
    public static final String EVEN = "Нечётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}
