package Old_Javarush.Syntax.Level17_Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Lecture7_1 {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
        System.out.println(ZonedDateTime.now());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> sortedZones = new TreeSet<>();
        for (String str : ZoneId.getAvailableZoneIds()) {
            sortedZones.add(str);
        }
        return sortedZones;
    }

    static ZonedDateTime getBeijingDateTime() {

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));//напишите тут ваш код


    }
}
