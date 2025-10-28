package Old_Javarush.Core.Level3_Interface;

import java.awt.*;

public class Lecture11_8 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    abstract static class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}
