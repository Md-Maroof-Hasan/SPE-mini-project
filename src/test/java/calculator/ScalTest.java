package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScalTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = 2 * 3;
        assertEquals(6, result);
    }

    @Test
    public void testFactorial() {
        long result = SCal.factorial(5);
        assertEquals(120, result);
    }
}