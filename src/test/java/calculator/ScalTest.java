package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScalTest {

    // ADDITION TESTS
    @Test
    public void testAddition1() {
        double result = 2 + 3;
        assertEquals(5, result, 0.001);
    }

    @Test
    public void testAddition2() {
        double result = 10 + 5;
        assertEquals(15, result, 0.001);
    }

    // SUBTRACTION TESTS
    @Test
    public void testSubtraction1() {
        double result = 10 - 4;
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testSubtraction2() {
        double result = 7 - 3;
        assertEquals(4, result, 0.001);
    }

    // MULTIPLICATION TESTS
    @Test
    public void testMultiplication1() {
        double result = 2 * 3;
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testMultiplication2() {
        double result = 4 * 5;
        assertEquals(20, result, 0.001);
    }

    // DIVISION TESTS
    @Test
    public void testDivision1() {
        double result = 10 / 2.0;
        assertEquals(5, result, 0.001);
    }

    @Test
    public void testDivision2() {
        double result = 9 / 3.0;
        assertEquals(3, result, 0.001);
    }

    // SQUARE ROOT TESTS
    @Test
    public void testSquareRoot1() {
        double result = Math.sqrt(16);
        assertEquals(4, result, 0.001);
    }

    @Test
    public void testSquareRoot2() {
        double result = Math.sqrt(25);
        assertEquals(5, result, 0.001);
    }

    // FACTORIAL TESTS
    @Test
    public void testFactorial1() {
        long result = SCal.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorial2() {
        long result = SCal.factorial(4);
        assertEquals(24, result);
    }

    // NATURAL LOG TESTS
    @Test
    public void testNaturalLog1() {
        double result = Math.log(1);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testNaturalLog2() {
        double result = Math.log(Math.E);
        assertEquals(1, result, 0.001);
    }

    // POWER TESTS
    @Test
    public void testPower1() {
        double result = Math.pow(2, 3);
        assertEquals(8, result, 0.001);
    }

    @Test
    public void testPower2() {
        double result = Math.pow(3, 2);
        assertEquals(9, result, 0.001);
    }
}