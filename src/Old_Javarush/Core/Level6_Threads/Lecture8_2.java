package Old_Javarush.Core.Level6_Threads;

public class Lecture8_2 {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();


        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                Thread current = Thread.currentThread();
                while (numSeconds>=0) {
                    if (numSeconds != 0) {
                        System.out.println(numSeconds);
                    }
                    Thread.sleep(1000);
                    numSeconds -= 1;
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                    }
                }
            } catch (InterruptedException e) {
                if (numSeconds > 0) {
                    System.out.println("Прервано!");
                }
            }

            //add your code here - добавь код тут
        }
    }
}
