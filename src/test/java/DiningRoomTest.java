import Rooms.DiningRooms.DiningRooms;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRooms diningRooms;

    @Before
    public void Before(){
        diningRooms = new DiningRooms(DiningRoomTypes.BREAKFAST, 40);
    }

    @Test
    public void hasDiningRoomType(){
        assertEquals(DiningRoomTypes.BREAKFAST, diningRooms.getDiningRoomTypes());
    }
}