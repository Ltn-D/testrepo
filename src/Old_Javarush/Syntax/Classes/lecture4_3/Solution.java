package Old_Javarush.Syntax.Classes.lecture4_3;

public class Solution {
    public static void main(String[] args) {


    Outer.Nested nested = new Outer.Nested();  //создаем объект nested вложенного класса Nested
    Outer.Inner inner = new Outer().new Inner(); // Т.к. Класс Inner не статический (внутренний), то его объекты не могут существовать без объектов класса в котором он создан
    Outer outer = new Outer(); // или так отдельно создаем объект outer, а в следующей строке создаем объект внутреннего класса Inner (inner1)
    Outer.Inner inner1 = outer.new Inner();

    }
}
