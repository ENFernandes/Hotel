package org.academiadecodigo.bootcamp;

public class Client {
    private String name;
    private boolean check;
    private int room;
    private int nRoom;
    private Hotel[] hotel = {new Hotel("cali"),new Hotel("tokyo"),new Hotel("lisbonera")};

    public Client(String name, int nRoom){
        this.setName(name);
        this.nRoom = nRoom;
    }

    public void setHotel(Hotel hotel) {

    }

    public String getHotel() {
        return hotel[nRoom].getName();
    }

    public void checkIn() {
        // pedir uma cena
        setRoom(hotel[nRoom].checkIn(this));
    }

    public void checkOut() {
        // pedir uma cena
        setRoom(hotel[nRoom].checkOut(this));
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }

    public boolean isCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }

    public void locationClient(){
        checkIn();
        System.out.println("Client: " + getName() + " is: " + isCheck() + " at: " + getHotel()  + " IN ROOM: " + hotel[nRoom].getRandomR());
        checkOut();
        System.out.println("Client: " + getName() + " is: " + isCheck() + " at: " + getHotel()  + " IN ROOM: " + hotel[nRoom].getRandomR());
    }
}
