package Old_Javarush.Core.Level3_Interface;

public class Lecture2_1 {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
            System.out.println(message);
        }

        @Override
        public void sayThankYou() {
            System.out.println("Thank You");
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("sleep");
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }
}
