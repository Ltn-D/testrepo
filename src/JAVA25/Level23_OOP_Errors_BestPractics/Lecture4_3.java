package JAVA25.Level23_OOP_Errors_BestPractics;

import Old_Javarush.Core.Level5_overload.Lecture8_11;

public class Lecture4_3 {
    static abstract class Appliance {
        public abstract void turnOn();
    }

    static class Kettle extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Чайник включен");
        }
        public void boil() {
            System.out.println("Вода закипела");
        }
    }

    static class Toaster extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Тостер включен");
        }
    }

    static void main(String[] args) {
        Appliance homeAppliance = new Kettle();
        if (homeAppliance instanceof Kettle) {
            Kettle kettle = (Kettle) homeAppliance;
            kettle.boil();
        }
    }
}
