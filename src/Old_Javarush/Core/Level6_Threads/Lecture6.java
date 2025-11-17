package Old_Javarush.Core.Level6_Threads;

public class Lecture6 {
    static class Clock implements Runnable {
        private boolean isCansel = false;

        public void cancel() {
            this.isCansel = true;
        }

        @Override
        public void run() {
            while (!isCansel) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Tik");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }

    static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10000);
        clock.cancel();
    }
}
