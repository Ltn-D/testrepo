package Old_Javarush.Core.Level3_Interface;

public class Lecture2_9 {
    static void main(String[] args) {

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove{
        public Double speed(CanFly fly);
    }
}
