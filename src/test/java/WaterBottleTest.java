import org.example.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void setUp() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolumeStartingAt100() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkRemoves10Volume(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canDrinkMultipleTimes(){
        bottle.drink();
        bottle.drink();
        bottle.drink();
        assertEquals(70, bottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
