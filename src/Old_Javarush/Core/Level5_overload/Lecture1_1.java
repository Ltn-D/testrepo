package Old_Javarush.Core.Level5_overload;

public class Lecture1_1 {
    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction() {
            return "test";
        }

        @Override
        public Object getAllowedAction(String name) {
            return name;
        }
    }
}


