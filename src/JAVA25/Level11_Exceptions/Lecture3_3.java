package JAVA25.Level11_Exceptions;

public class Lecture3_3 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        }finally {
            System.out.println("Датчик сообщает: Работа finally завершена. Даже в случае аварии.");
        }
    }
}
