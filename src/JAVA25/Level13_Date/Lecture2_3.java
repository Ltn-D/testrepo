package JAVA25.Level13_Date;

import java.time.LocalTime;

public class Lecture2_3 {
    static void main(String[] args) {
        LocalTime morningMeeting = LocalTime.of(8, 00);
        LocalTime afternoonPresentation = LocalTime.of(14, 30);
        if (morningMeeting.isBefore(afternoonPresentation)) {
            System.out.printf("%s раньше %s",morningMeeting,afternoonPresentation);
        } else {
            System.out.printf("%s не раньше %s",morningMeeting,afternoonPresentation);
        }
    }
}
