package JAVA25.Level13_Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture3_2 {
    static void main(String[] args) {
        LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 06, 01, 14, 00);
        ZoneId conferenceStartMinskZone = ZoneId.of("Europe/Minsk");
        ZonedDateTime conferenceStartMinskZoned = ZonedDateTime.of(conferenceStartLocal, conferenceStartMinskZone);
        DateTimeFormatter out = DateTimeFormatter.ofPattern("d MMMM yyyy года, HH:mm VV");
        String string = conferenceStartMinskZoned.format(out);
        System.out.printf("Время начала конференции в Минске: %s",string);
    }


}
