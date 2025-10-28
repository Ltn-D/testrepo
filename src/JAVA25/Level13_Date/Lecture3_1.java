package JAVA25.Level13_Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Lecture3_1 {
    static final ZoneId MINSK = ZoneId.of("Europe/Minsk");
    static final ZoneId NEW_YORK = ZoneId.of("America/New_York");
    static final ZoneId TOKYO = ZoneId.of("Asia/Tokyo");

    static void main(String[] args) {
        ZonedDateTime currentTimeInMinsk = ZonedDateTime.now(MINSK);
        ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(NEW_YORK);
        ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(TOKYO);
        System.out.printf("Minsk: %s\nNew York: %s\nTokyo: %s",currentTimeInMinsk,currentTimeInNewYork,currentTimeInTokyo);

    }
}
