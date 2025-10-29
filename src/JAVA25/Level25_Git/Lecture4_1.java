package JAVA25.Level25_Git;

public class Lecture4_1 {
    static interface CanFly {
        void soar();
    }

    static class Aircraft implements CanFly {
        @Override
        public void soar() {
            System.out.println("Самолёт взлетает!");
        }
    }
    static class Eagle implements CanFly{
        @Override
        public void soar() {
            System.out.println("Орёл парит!");
        }
    }
    public static void launchIntoSky(CanFly flyingObject) {
        flyingObject.soar();
    }

    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        Eagle eagle = new Eagle();
        launchIntoSky(aircraft);
        launchIntoSky(eagle);
    }

}
