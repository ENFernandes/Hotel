package org.academiadecodigo.bootcamp;

public class Room {
    private ListHotel name;
    private int room;
    private boolean ocu;

    public Room(ListHotel name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public boolean isOcu() {
        return ocu;
    }

    public void setOcu(boolean ocu) {
        this.ocu = ocu;
    }

    public ListHotel getName() {
        return name;
    }
}
