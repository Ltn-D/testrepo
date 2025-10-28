package JAVA25.Level11_Exceptions;

public class Lecture2_3 {
    static void main(String[] args) {
        int scores = 50;
        int numberOFPlayers = 0;
        try {
            System.out.println(scores / numberOFPlayers);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
