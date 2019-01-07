import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.currentVolume(), 0.01);
    }

    @Test
    public void canRemove10Volume(){
        waterBottle.takeADrink();
        assertEquals(90, waterBottle.currentVolume(), 0.01);
    }

    @Test
    public void canRemove100Volume(){
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        waterBottle.takeADrink();
        assertEquals(0, waterBottle.currentVolume(), 0.01);
    }

    @Test
    public void canEmptyVoume(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.currentVolume(), 0.01);
    }

    @Test
    public void canRefillVolume(){
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.currentVolume(), 0.01);
    }
}
