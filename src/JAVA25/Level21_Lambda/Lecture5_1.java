package JAVA25.Level21_Lambda;

public class Lecture5_1 {
    static interface Comparable<NumberBox> {
    }

    static class NumberBox implements Comparable {
        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public NumberBox(int number) {
            this.number = number;
        }

        public int compareTo(NumberBox numberBox) {
            return Integer.compare(this.number, numberBox.number);
        }
    }
    static void main(String[] args) {
        NumberBox boxA = new NumberBox(10);
        NumberBox boxB = new NumberBox(5);

        // Сравниваем их: положительное число — boxA больше boxB; отрицательное — меньше; ноль — равны
        int result = boxA.compareTo(boxB);

        // Выводим результат сравнения на экран
        System.out.println(result);

    }
}
