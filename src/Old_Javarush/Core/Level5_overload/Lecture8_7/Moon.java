package Old_Javarush.Core.Level5_overload.Lecture8_7;

public class Moon implements Planet {
    private static Moon INSTANCE;
    private Moon() {
    }

    public static Moon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Moon();

        }
        return INSTANCE;
    }
}
