package Old_Javarush.Syntax.Collections;

public class Lecture2_2 {
    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        System.out.println(a / b);// можно не переводить в объекты
    }
}
