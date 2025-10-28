package Old_Javarush.Core.Level5_overload.Lecture8_1;

public class Plane implements CanFly{
    private int countPassenger;

    public Plane(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
