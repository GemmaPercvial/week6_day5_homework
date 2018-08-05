import org.junit.Before;
import org.junit.Test;

    public class HotelTest {
        Hotel hotel;

        @Before
        public void before(){
            hotel = new Hotel();
            guest = new Guests("John", "Smith");
            room1 = new BedRooms(BedroomTypes.SINGLE, 50);
            room2 = new BedRooms(BedroomTypes.DOUBLE, 70, 2);
            room3 = new BedRooms(BedroomTypes.FAMILY, 100, 4);
            conferenceRoom1 = new ConferenceRooms(ConferenceRoomTypes.SMALL, 300.00);
            conferenceRoom2 = new ConferenceRooms(ConferenceRoomTypes.MEDIUM, 400.00);
            conferenceRoom3 = new ConferenceRooms(ConferenceRoomTypes.LARGE, 500.00);
            diningRoom1 = new DiningRooms(DiningRoomTypes.BREAKFAST);
            diningRoom2 = new DiningRooms(DiningRoomTypes.LUNCH);
            diningRoom3 = new DiningRooms(DiningRoomTypes.DINNER);
        }
    }