package Izuchaem_Java.Chapter_4;

import javax.xml.transform.Source;

class Clock {
     String time;

     void setTime(String t) {
         time = t;
     }

     String getTime() {
         return time;
     }
}

public class ClockTestDrive {
    static void main() {
        Clock c = new Clock();
        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("Time" + tod);
    }

}
