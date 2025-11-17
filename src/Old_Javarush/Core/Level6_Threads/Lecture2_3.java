package Old_Javarush.Core.Level6_Threads;

import java.util.ArrayList;
import java.util.List;

public class Lecture2_3 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        list.add(new Thread(new SpecialThread()));//напишите тут ваш код
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
    }


    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }

}
