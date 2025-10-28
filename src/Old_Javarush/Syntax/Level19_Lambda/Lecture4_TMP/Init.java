package Old_Javarush.Syntax.Level19_Lambda.Lecture4_TMP;

import java.util.List;

public class Init {
    public static List<Owner> owners;



    public static void initData() {
        final Owner owner1 = new Owner("Олег Машков");
        owner1.getPets().addAll(List.of(
                new Cat(3, Color.BLACK, "Барон"),
                new Cat(4, Color.DARK_GREY, "Султан"),
                new Dog(0, Color.WHITE, "Эльза")
        ));
        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat(7, Color.FOXY, "Рыжик"),
                new Cat(5, Color.FOXY, "Барсик"),
                new Parrot(3, Color.BLUE, "Адмирал")
        ));

        final Owner owner3 = new Owner("Наталия Криж");
        owner3.getPets().addAll(List.of(
                new Dog(3, Color.FOXY, "Арнольд"),
                new Pig(8, Color.LIGHT_GREY, "Пылесос")
        ));

        final Owner owner4 = new Owner("Павел Мурахов");
        owner4.getPets().addAll(List.of(
                new Snake(2, Color.DARK_GREY, "Удав")
        ));

        final Owner owner5 = new Owner("Антон Федоренко");
        owner5.getPets().addAll(List.of(
                new Cat(16, Color.BLACK, "Фишер"),
                new Cat(14, Color.FOXY, "Зорро"),
                new Cat(3, Color.WHITE, "Марго"),
                new Cat(1, Color.DARK_GREY,"Забияка" )
        ));
        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }
}
