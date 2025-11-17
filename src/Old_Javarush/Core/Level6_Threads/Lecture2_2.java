package Old_Javarush.Core.Level6_Threads;

public class Lecture2_2 {
    public static class TestThread extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        public void run() {
            System.out.println("it's a run method");
        }
    }

    static void main() {
        TestThread thread = new TestThread();
        new Thread(thread).start();
    }
}
