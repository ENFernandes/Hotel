package org.academiadecodigo.bootcamp;

public class Hotel {

    private ListHotel name;
    private Room[] rooms = new Room[1];
    private int randomR = (int) (Math.random() * 1);

    public Hotel(ListHotel name) {
        for (int i = 0; i < 1; i++) {
            rooms[i] = new Room(name);
        }
        this.name = name;
    }

    public ListHotel getName() {
        return name;
    }

    public int getRandomR() {
        return randomR;
    }


    public int checkIn(Client client) {
        for (Room run : rooms) {
            if (rooms[randomR].isOcu() == false) {
                client.setCheck(true);
                this.rooms[randomR].setOcu(true);
                return this.rooms[randomR].getRoom();
            }
        }
        System.out.printf("\nHotel Cheio");
        return -1;
    }

    public int checkOut(Client client) {
        client.setCheck(false);
        rooms[randomR].setOcu(false);
        return rooms[randomR].getRoom();
    }
}
