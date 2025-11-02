package JAVA25.Level29_Comparator;

import java.util.HashSet;
import java.util.Objects;

public class Lecture1_1 {
    static class City {
        private String cityName;
        private int cityPopulation;

        public City(String cityName,int cityPopulation) {
            this.cityPopulation = cityPopulation;
            this.cityName = cityName;
        }

        @Override
        public boolean equals(Object object) {
            if (this==object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            City city = (City) object;
            return cityPopulation == city.cityPopulation && Objects.equals(cityName, city.cityName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cityName, cityPopulation);
        }


    }
    static void main(String[] args) {
        HashSet<City> cities = new HashSet<>();
        cities.add(new City("Метрополис", 1_000_000));
        cities.add(new City("Метрополис", 1_000_000));
        System.out.println(cities.size());

    }

}

