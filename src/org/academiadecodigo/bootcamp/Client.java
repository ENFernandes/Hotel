package org.academiadecodigo.bootcamp;

import java.util.ArrayList;

public class Client {
    private String name;
    private int nseiq;
    private boolean check;
    private int room;
    private ListHotel listHotel;
    private static Hotel[] hotel = {new Hotel(ListHotel.CALI),new Hotel(ListHotel.TOKYO),new Hotel(ListHotel.PORTOBONERA), new Hotel(ListHotel.NONE)};
    private static ArrayList<Client> clientList = new ArrayList<Client>(); // CHECKOUT TRY

    public Client(String name, ListHotel listHotel){
        this.setName(name);
        this.listHotel = listHotel;
        clientList.add(this); // CHECKOUT TRY
    }

    public Client(String name) {
        this.name = name;
        clientList.add(this); // CHECKOUT TRY
    }

    public static void showClients(String in) {
        if (in.equals("in")) {
            for(int i = 0; i < clientList.size(); i++) {
                if (!(clientList.get(i).isCheck())) {
                    System.out.println(i + ". " + clientList.get(i).getName() + "@" + clientList.get(i).getHotel());
                }
            }
        } else {
            for (int i = 0; i < clientList.size(); i++) {
                if (clientList.get(i).isCheck()) {
                    System.out.println(i + ". " + clientList.get(i).getName() + "@" + clientList.get(i).getHotel());
                }
            }
        }
    }

    public static Client setClient(int cl) {
        return clientList.get(cl);
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
