package org.academiadecodigo.bootcamp;

public class Hotel {

    private String name;
    private Room[] rooms = new Room[100];
    private int randomR = (int) (Math.random() * 100);

    public Hotel(String name)
    {
        for (int i = 0; i <= 99; i++) {
            rooms[i] = new Room();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRandomR(){
        return randomR;
    }


    public int checkIn(Client client)
    {
        client.setCheck(true);
        rooms[randomR].setOcu(true);
        return rooms[randomR].getRoom();
    }
    public int checkOut(Client client)
    {
        client.setCheck(false);
        rooms[randomR].setOcu(false);
        return rooms[randomR].getRoom();
    }
}
