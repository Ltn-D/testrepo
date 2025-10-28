package JAVA25.Level15_encapsulation;

public class Lecture4_1 {
    static void main(String[] args) {
        System.out.println(ApplicationMetrics.getActiveUserCount());
    }
}

class ApplicationMetrics {
    private static int activeUserCount = 10;

    public static int getActiveUserCount() {
        return activeUserCount;
    }

    public static void setActiveUserCount(int activeUserCount) {
        ApplicationMetrics.activeUserCount = activeUserCount;
    }
}
