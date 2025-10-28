package JAVA25.Level16_Inner_Nested;

public class Lecture1_4 {
    static void main(String[] args) {
        // Создаём дом с общим адресом
        House house = new House("Sunny Valley Lane");
        Lecture1_3.Library tst = new Lecture1_3.Library();

        // Через объект внешнего класса создаём объект внутреннего класса.
        // Синтаксис house.new Room(...) обязателен для non-static inner класса.
        House.Room room = house.new Room("Master Bedroom");

        // Выводим идентификатор комнаты и общий адрес дома
        room.printAddresses();
    }

    static class House {
        private String houseAddress;

        public House(String houseAddress) {
            this.houseAddress = houseAddress;
        }

        class Room {
            private String roomIdentifier;

            public Room(String roomIdentifier) {
                this.roomIdentifier = roomIdentifier;
            }
            public void printAddresses() {
                System.out.println(roomIdentifier);
                System.out.println(House.this.houseAddress);
            }
        }
    }
}
