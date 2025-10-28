package Old_Javarush.Core.Level5_overload.Lecture8_7;

public class Sun implements Planet {
    private static Sun INSTANSE;

    private Sun() {
    }

    public static Sun getInstance() {
        if (INSTANSE == null) {
            INSTANSE = new Sun();
        }
        return INSTANSE;
    }
}
