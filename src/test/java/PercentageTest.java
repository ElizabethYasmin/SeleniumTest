import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PercentageTest {
    @Test
    public void evaluatePercentage1(){
        Percentage percentage = new Percentage();
        String result = percentage.calculate("10", "100");
        assertEquals("10", result);
    }

    @Test
    public void evaluatePercentage2(){
        Percentage percentage = new Percentage();
        String result = percentage.calculate("15", "200");
        assertEquals("30", result);
    }
}
