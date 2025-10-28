package Old_Javarush.Core.Level5_overload.Lecture8_7;

public class Earth implements Planet{
    private static Earth INSTANCE;

    public Earth() {
    }

    public static Earth getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Earth();
        }
        return INSTANCE;
    }
}
