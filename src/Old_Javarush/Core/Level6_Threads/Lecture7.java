package Old_Javarush.Core.Level6_Threads;

public class Lecture7 {
    static class Clock implements Runnable {

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while ((!current.isInterrupted())) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Tik");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    current.interrupt();
                }
            }
        }
    }

    static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10000);
        clockThread.interrupt();
    }

}
