package Old_Javarush.Core.Level3_Interface;

public class Lecture11_7 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void refresh() {
            System.out.println(123);
        }

        @Override
        public void onSelect() {
            System.out.println(321);
        }
    }
}
