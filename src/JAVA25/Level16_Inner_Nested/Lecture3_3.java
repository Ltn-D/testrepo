package JAVA25.Level16_Inner_Nested;

public class Lecture3_3 {

    public void startCountOperation() {
        Runnable counter = new Runnable(){
            @Override
            public void run() {
                System.out.println("Счётчик запущен");
            }
        };
        counter.run();
    }

    static void main(String[] args) {
        Lecture3_3 counter = new Lecture3_3();
        counter.startCountOperation();
    }
}
