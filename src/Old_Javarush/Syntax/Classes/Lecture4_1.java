package Old_Javarush.Syntax.Classes;

public class Lecture4_1 {
    public static void main(String[] args) {
        Engine engine = new Lecture4_1(). new Engine();
        /* или можно так
        Lecture4_1 lecture4_1 = new Lecture4_1();
        Engine engine1 = lecture4_1.new Engine();

        */
        engine.start();
        System.out.println(engine.isRunning);
        engine.stop();
        System.out.println(engine.isRunning);
        engine.engineStatus();
    }

    /* ответ задачи просто
    Engine engine = new Engine();
    все что выше вызов методов и т.к void main - statik то сначала создаем объект класса а потом еже применяем к нему методы.
     */

    class Engine {
        boolean isRunning = false;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
        public void engineStatus(){
            System.out.println(isRunning);
        }
    }
}
