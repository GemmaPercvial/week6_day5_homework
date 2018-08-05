import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomsTest {
    Bedrooms bedrooms;

    @Before
    public void before() {
        bedrooms = new Bedrooms(BedroomTypes.SINGLE, 50.00, 2);
    }

    @Test
    public void hasBedroomType(){
        assertEquals(BedroomTypes.SINGLE, bedrooms.getBedroomType());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(50.00, bedrooms.getNightlyRate(), 2);
    }

}
