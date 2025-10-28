package Old_Javarush.Syntax.Level17_Date;

import java.time.DateTimeException;
import java.time.Instant;

public class Lecture6_3 {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant maxMilliseconds = Instant.ofEpochMilli(Long.MAX_VALUE);

        return maxMilliseconds;
    }

    static Instant getMaxFromSeconds() {
        Instant maxSeconds = null;//напишите тут ваш код
        try {
            maxSeconds = Instant.ofEpochSecond(Long.MAX_VALUE);
        } catch (DateTimeException e) {
            maxSeconds = Instant.MAX.minusNanos(999999999);
        }

        return maxSeconds;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant maxSecondAndNanos = null;
        try {
            maxSecondAndNanos = Instant.ofEpochSecond(Long.MAX_VALUE);
        } catch (DateTimeException e) {
            maxSecondAndNanos = Instant.MAX;
        }//напишите тут ваш код

        return maxSecondAndNanos;
    }

}
