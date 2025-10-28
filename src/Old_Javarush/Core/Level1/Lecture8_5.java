package Old_Javarush.Core.Level1;

public class Lecture8_5 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private  int age;
        private  int weight;
        private int speed;

        public Cat(String name, int age, int weight, int speed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.speed = speed;

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }
    }

}
