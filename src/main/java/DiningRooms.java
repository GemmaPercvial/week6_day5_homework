public class DiningRooms extends Rooms {

    private DiningRoomTypes roomType;

    public DiningRooms(DiningRoomTypes roomType, int capacity){
        super(capacity);
        this.roomType = roomType;
    }

    public DiningRoomTypes getDiningRoomTypes(){
        return roomType;
    }
}
