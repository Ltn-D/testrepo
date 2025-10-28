package Old_Javarush.Core.Level3_Interface;

public class Lecture2_4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    static class Screen implements Selectable, Updatable {
        @Override
        public void refresh() {
            System.out.println("1");
        }

        @Override
        public void onSelect() {
            System.out.println("2");
        }
    }
}
