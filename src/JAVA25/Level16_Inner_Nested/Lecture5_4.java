package JAVA25.Level16_Inner_Nested;

public class Lecture5_4 {
    public static class DevUtils {
        public static <T> void printTwice(T value) {
            System.out.println(value);
            System.out.println(value);
        }
    }

    static void main(String[] args) {
        DevUtils.printTwice("Java");
        DevUtils.printTwice(1235);
    }

}
