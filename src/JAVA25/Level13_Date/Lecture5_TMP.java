package JAVA25.Level13_Date;

import java.time.*;

public class Lecture5_TMP {
    static void main(String[] args) {
        ZonedDateTime minskTime = ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, ZoneId.of("Europe/Minsk"));
        ZonedDateTime nyTime = ZonedDateTime.of(2025, 6, 1, 5, 0, 0, 0, ZoneId.of("America/New_York"));
        Instant zeroTime = minskTime.toInstant();
        ZonedDateTime zuluTime = zeroTime.atZone(ZoneId.of("Europe/London"));
        System.out.println(minskTime + "\n" + nyTime + "\n" + zuluTime);
        Duration d1 = Duration.between(minskTime, zuluTime);
        Duration d2 = Duration.between(nyTime, zuluTime);
        Duration d3 = Duration.between(minskTime, nyTime);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
