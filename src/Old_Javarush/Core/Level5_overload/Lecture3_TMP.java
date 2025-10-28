package Old_Javarush.Core.Level5_overload;

import Old_Javarush.Core.Level2.Lecture6_1;

public class Lecture3_TMP {
    static class Animal {
        static String s1 ="Static base";

        String s2 = "string base";


        public Animal() {
            //this.s2 = s2;
            System.out.println(s1);
            System.out.println(s2);
        }



    }

    static class Pet extends Animal {
        static String s4 = "Static ext";
        String s3 = "String ext";



        public Pet() {
            super();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
        }
    }

    static void main(String[] args) {
        Pet pet = new Pet();
    }
}
