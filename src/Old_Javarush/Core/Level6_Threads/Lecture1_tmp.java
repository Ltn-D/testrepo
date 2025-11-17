package Old_Javarush.Core.Level6_Threads;

public class Lecture1_tmp {
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

    static void main(String[] args) {
        Printer printer1 = new Printer("Xerox");
        Printer printer2 = new Printer("Canon");
        Thread thread = new Thread(printer1);
        Thread thread1 = new Thread(printer2);
        thread.start();
        thread1.start();
        System.out.println("I have two printers");
        System.out.println("Printers finished");
    }
}
