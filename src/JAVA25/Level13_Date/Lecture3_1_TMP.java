package JAVA25.Level13_Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Lecture3_1_TMP {
    static void main(String[] args) {
        ZoneId usa = ZoneId.of("America/New_York");
        ZonedDateTime zone0 = ZonedDateTime.now(usa);
        Instant now = Instant.now();
        Instant ins = zone0.toInstant();
        ZoneId newZone = ZoneId.of("Asia/Yekaterinburg");
        //ZoneId usa = ZoneId.of("America/New_York");
        ZonedDateTime zonedT = ins.atZone(newZone);
        System.out.println(zone0);
        System.out.println(now);
        System.out.println(ins);
        System.out.println(zonedT);
        System.out.println(ins.atZone(usa));
    }
}
