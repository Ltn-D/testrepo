package JAVA25.Level20_interfaces;

public class Lecture3_4 {
    interface Player {
        void play();
    }

    interface Recorder {
        void record();
    }

    static class MediaDevice implements Player, Recorder {
        @Override
        public void play() {
            System.out.println("Воспроизведение");
        }

        @Override
        public void record() {
            System.out.println("Запись");
        }
        public static void testDevice(Player p, Recorder r) {
            p.play();
            r.record();
        }

        static void main(String[] args) {
            MediaDevice device = new MediaDevice();
            testDevice(device,device);
        }
    }
}
