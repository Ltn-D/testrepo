package JAVA25.Level29_Comparator;

import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;

public class Lecture3_2 {
    static class City implements Comparable<City> {
        private String cityName;
        private int cityPopulation;

        public String getCityName() {
            return cityName;
        }

        public int getCityPopulation() {
            return cityPopulation;
        }

        public City(String cityName, int cityPopulation) {
            this.cityName = cityName;
            this.cityPopulation = cityPopulation;
        }

        @Override
        public boolean equals(Object object) {
            if (this==object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            City city = (City) object;
            return getCityPopulation() == city.getCityPopulation() && Objects.equals(getCityName(), city.getCityName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getCityName(), getCityPopulation());
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.getCityPopulation(), o.getCityPopulation());
        }

        @Override
        public String toString() {
            return "City{" +
                    "cityName='" + cityName + '\'' +
                    ", cityPopulation=" + cityPopulation +
                    '}';
        }
    }
    public static void main(String[] args) {
        // Создаем два разных объекта City с одинаковыми значениями полей
        City city1 = new City("Springfield", 100_000);
        City city2 = new City("Springfield", 100_000);
        City city3 = new City("Springfield", 120_000);

        // TreeSet автоматически сортирует элементы и не добавляет "дубликаты"
        // (дубликатом считается элемент с compareTo == 0)
        TreeSet<City> cities = new TreeSet<>();
        cities.add(city3);
        cities.add(city2);
        cities.add(city1);


        // Ожидаем размер 1, так как города идентичны по всем полям
        System.out.println(cities);
        System.out.println(cities.size());
    }
}
