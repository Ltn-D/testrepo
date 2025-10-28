package JAVA25.Level20_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Lecture5_4 {
    public static void main(String[] args) {
        // Создаем издателя
        NewsPublisher publisher = new NewsPublisher();

        // Создаем двух подписчиков с разными именами
        Person andrey = new Person("Андрей");
        Person boris = new Person("Борис");

        // Подписываем их на новости
        publisher.addSubscriber(andrey);
        publisher.addSubscriber(boris);

        // Оповещаем всех подписчиков о новой новости
        publisher.notifySubscribers("Обновление курса Java!");
    }

    static interface Subscriber {
        void update(String news);
    }

    static class NewsPublisher {
        private List<Subscriber> subscribers = new ArrayList<>();

        public void addSubscriber(Subscriber subscriber) {
            subscribers.add(subscriber);
        }
        public void removeSubscriber(Subscriber subscriber) {
            subscribers.remove(subscriber);
        }

        public void notifySubscribers(String news) {
            for (Subscriber subscriber : subscribers) {
                subscriber.update(news);
            }
        }
    }

    static class Person implements Subscriber {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public void update(String news) {
            System.out.println(name + " получил новость: " + news);
        }
    }
}
