package Old_Javarush.Syntax.Level18_OOP;

public class Lecture2_TMP {
    static void main(String[] args) {
        Cow cow = new Cow();
        cow.printColor();
        cow.printName();
        Whale whale = new Whale();
        whale.printName();
        whale.printColor();
        whale.printAll();
        Cow cowWhale = new Whale();//Расширение типа Т.к. класс при наследовании получает все методы и данные класса-родителя, объект этого класса разрешается сохранять (присваивать) в переменные класса-родителя (и родителя родителя, и т.д., вплоть до Object).;
        cowWhale.printAll();//т.к. фактически cowWhale это объект Cow у объекта cowWhale типа Whale можно вызывать только методы, описанные в классе Cow.
        //Whale whaleCow = new Cow(); наоборот нельзя будет сгенерировано исключение — InvalidClassCastException.
        if (cowWhale instanceof Whale){//instanceof проверяет можно ли сохранить объект Cow в Whale
        Whale whale1 = (Whale) cowWhale;} // если можно - приводим cowWhale к типу Whale. Будут работать методы Whale


    }
}

class Cow {
    public void printAll() {
        printColor();
        printName();
    }
    public void printColor() {
        System.out.println("white");
    }

    public void printName() {
        System.out.println("I am cow");
    }
}

class Whale extends Cow{
    public void printName() {
        super.printName();// вызов метода родительского класса
        System.out.println("False");
        System.out.println("I am whale");
    }
}