package Old_Javarush.Core.Level6_Threads;

public class Lecture2_1 {
    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }

    static void main() {
        TestThread thread = new TestThread();
        new Thread(thread).start();
    }
}
