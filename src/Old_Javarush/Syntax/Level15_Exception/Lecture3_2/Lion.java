package Old_Javarush.Syntax.Level15_Exception.Lecture3_2;

public class Lion {


    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.name);
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
            return;// этот return не нужен т.к. finally выполнится в любом случае
        } finally {
            System.out.println("лег спать" + (food == null ? " голодным" : ""));
        }

        //System.out.println("лег спать" + (food == null ? " голодным" : ""));
    }
}
