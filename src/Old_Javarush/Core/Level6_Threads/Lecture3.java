package Old_Javarush.Core.Level6_Threads;

public class Lecture3 {
    static class Printer implements Runnable {
        private String name;

        public Printer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("I'm " + name);
        }
    }

    static void main(String[] args) throws InterruptedException {
        Lecture1_tmp.Printer printer1 = new Lecture1_tmp.Printer("Xerox");
        Lecture1_tmp.Printer printer2 = new Lecture1_tmp.Printer("Canon");
        Thread thread = new Thread(printer1);
        Thread thread1 = new Thread(printer2);
        //thread.start();
        thread1.start();
        thread.start();
        System.out.println("I have two printers");
        thread.join();
        thread1.join();
        System.out.println("Printers finished");
    }
}
