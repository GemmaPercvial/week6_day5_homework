import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomsTest {
    ConferenceRooms conferenceRooms;

    @Before
    public void before(){
        conferenceRooms = new ConferenceRooms(ConferenceRoomTypes.SMALL, 300.00, 2 );
    }

    @Test
    public void hasConferenceRoomType(){
        assertEquals(ConferenceRoomTypes.SMALL, conferenceRooms.getConferenceRoomsType());

    }

    @Test
    public void hasDayRate(){
        assertEquals(300.00, conferenceRooms.getDayRate(), 2);
    }
}