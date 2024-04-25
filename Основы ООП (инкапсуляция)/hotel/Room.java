package hotel;

public class Room {
    private int number;
    private boolean reserved;
    private boolean wc;
    private boolean tv;
    private int place;

    public Room(int number, boolean wc, boolean tv, int place) {
        this.number = number;
        this.reserved = false;
        this.wc = wc;
        this.tv = tv;
        this.place = place;
    }

    public int getNumber() {
        return number;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isTv() {
        return tv;
    }

    public int getPlace() {
        return place;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
