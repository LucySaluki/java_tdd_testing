import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }
    @Test // Test 1: Check volume is 100
    public void bottleHasVolume100() {
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void takeADrink() {
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }
    @Test
    public void emptyTheBottleToZero() {
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillUpWaterBottle(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
