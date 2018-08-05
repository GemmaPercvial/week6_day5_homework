import java.util.ArrayList;

public abstract class Rooms {
    private ArrayList<Guests> guests;
    private int capacity;
    private Object BedroomTypes;

    public Rooms(ArrayList<Guests> guests, int capacity) {
    this.guests = new ArrayList<Guests>();}

    public Rooms(int capacity) {
        this.capacity = capacity;
    }

}