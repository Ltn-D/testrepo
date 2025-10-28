package JAVA25.Level20_interfaces;

public class Lecture5_3 {
    static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setGreetingStrategy(new FriendlyGreeting());
        greeter.greet("Вася");

        greeter.setGreetingStrategy(new FormalGreeting());
        greeter.greet("Вася");
    }

    static interface GreetingStrategy {
        void greet(String name);
    }

    static class FriendlyGreeting implements GreetingStrategy {
        @Override
        public void greet(String name) {
            System.out.println("Привет, " + name+"!");
        }
    }

    static class FormalGreeting implements GreetingStrategy {
        @Override
        public void greet(String name) {
            System.out.println("Здравствуйте, " + name + ".");
        }
    }

    static class Greeter {
        private GreetingStrategy greetingStrategy;

        public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
            this.greetingStrategy = greetingStrategy;
        }

        public void greet(String name) {
            greetingStrategy.greet(name);
        }
    }

}
