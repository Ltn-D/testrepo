package JAVA25.Level13_Date;

import java.time.LocalTime;

public class Lecture2_1 {
    static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int displayHours = currentTime.getHour();
        int displayMinutes = currentTime.getMinute();
        int displaySeconds = currentTime.getSecond();
        System.out.printf("Часы: %d, минуты: %d, секунды: %d",displayHours,displayMinutes,displaySeconds);
    }
}
