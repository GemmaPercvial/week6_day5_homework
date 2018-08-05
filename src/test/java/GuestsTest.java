import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestsTest {

    private Guests guest;

    @Before
    public void before() {
        guest = new Guests("John", "Smith");
    }

    @Test
    public void canGetFirstName() {
        assertEquals("John", guest.getFirstName());
    }

    @Test
    public void canGetLastName() {
        assertEquals("Smith", guest.getLastName());
    }
}