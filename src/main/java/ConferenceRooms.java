public class ConferenceRooms extends Rooms {

    private ConferenceRoomTypes roomType;
    private double dayRate;

    public ConferenceRooms(ConferenceRoomTypes roomType, double dayRate, int capacity){
        super(capacity);
        this.roomType = roomType;
        this.dayRate = dayRate;
    }

    public ConferenceRoomTypes getConferenceRoomsType(){
        return roomType;
    }

    public double getDayRate(){
        return dayRate;
    }

}
