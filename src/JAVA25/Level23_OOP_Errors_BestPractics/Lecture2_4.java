package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture2_4 {
    static class OverloadDemo {
        public void print(int valueToPrint) {
            System.out.println("int: " + valueToPrint);
        }

        public void print(double valueToPrint) {
            System.out.println("double: " + valueToPrint);
        }
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        long value = 5L; // Явно используем тип long

        // Здесь Java выберет перегрузку print(double),
        demo.print(value); // Ожидаемый вывод: "double: 5.0"
    }

}
