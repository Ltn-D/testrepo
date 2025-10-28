package Old_Javarush.Syntax.Objekts;

public class Lecture5_1 {
    public static class Iphone {
        private String model;
        private String color;
        private int price;

        public Iphone(String model, String color, int price) {
            this.model = model;
            this.color = color;
            this.price = price;
        }

        public boolean equals(Object object) {// переопределяем метод, т.к. по умолчанию объявляются два разных объекта (через new), и встроенный метод сравнит ссылки и выдаст false

            if (this == object) {
                return true;
            } else if (object == null) {
                return false;
            } else if (!(object instanceof Iphone)) {//можно через iphone.getClass != iphone1.getClass
                return false;
            }
            Iphone iphone = (Iphone) object; // приводим object к Iphone
            return this.price == iphone.price && (this.model != null && this.model.equals(iphone.model) && (this.color != null && this.color.equals(iphone.color)));// перед сравнением строк дополнительно проверяем что строка не null
        }

        public static void main(String[] args) {
            Iphone iphone = new Iphone("X", "Black", 150);
            Iphone iphone1 = new Iphone("X", "Black", 150);
            System.out.println(iphone.equals(iphone1));
            System.out.println(iphone.getClass());
        }
    }
}
