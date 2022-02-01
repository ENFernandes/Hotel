package org.academiadecodigo.bootcamp;

public class Client {
    private String name;
    private int nseiq;
    private boolean check;
    private int room;
    private ListHotel listHotel;
    private static Hotel[] hotel = {new Hotel(ListHotel.CALI),new Hotel(ListHotel.TOKYO),new Hotel(ListHotel.PORTOBONERA)};

    public Client(String name, ListHotel listHotel){
        this.setName(name);
        this.listHotel = listHotel;
    }

    public void setHotel(ListHotel hotel) {
        this.listHotel=hotel;
    }

    public ListHotel getHotel() {
        return hotel[listHotel.ordinal()].getName();
    }

    public int checkIn() {
        // pedir uma cena
        setRoom(hotel[listHotel.ordinal()].checkIn(this));
        nseiq = getRoom();
        return nseiq;

    }

    public void checkOut() {
        // pedir uma cena
        setRoom(hotel[listHotel.ordinal()].checkOut(this));
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
        if(checkIn()!=-1) {
            System.out.println("Client: " + getName() + " is: " + isCheck() + " at: " + getHotel() + " IN ROOM: " + hotel[listHotel.ordinal()].getRandomR());
        }
        else {
            new MenuHoteis(this);
        }
        //checkOut();
        //System.out.println("Client: " + getName() + " is: " + isCheck() + " at: " + getHotel()  + " IN ROOM: " + hotel[listHotel.ordinal()].getRandomR());
    }
}
