package JAVA25.Level5;

public class Lecture5_2 {
    static void main(String[] args) {
        int start = 1;
        while (true) {
            if (start % 7 == 0) {
                System.out.println("Первое число, кратное 7: " + start);
                break;
            } else {
                start += 1;
            }
        }
    }
}
