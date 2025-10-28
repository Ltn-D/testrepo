package Old_Javarush.Core.Level4_instanseof;

public class Lecture4_1 {
    static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {
        return new Building();
    }
    static class School extends Building{
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
