package Old_Javarush.Syntax.Level15_Exception;

public class Lecture3 {
    static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Перехватили исключение");
            throw e;
        }
    }
}
