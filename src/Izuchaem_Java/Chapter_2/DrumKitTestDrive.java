package Izuchaem_Java.Chapter_2;

public class DrumKitTestDrive {
    static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if (d.snare) {
            d.playSnare();
        }

        d.playTopHat();


    }

    static class DrumKit {
        boolean topHat = true;
        boolean snare = true;

        void playSnare() {
            System.out.println("Бах-бах-ба-бах");
        }

        void playTopHat() {
            System.out.println("Динь-динь-ди-динь");
        }
    }
}
