import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator1;

    @Before
    public void setUp(){
        calculator1 = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator1.add(8, 2));
    }

    @Test
    public void canAddWithNegativeNumber(){
        assertEquals(-8, calculator1.add(-3, -5));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator1.subtract(10, 5));
    }

    @Test
    public void canSubtractToGetNegativeNumbers() {
        assertEquals(-5, calculator1.subtract(10, 15));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculator1.multiply(2, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator1.divide(6, 3));
    }

    @Test
    public void canDivideAndHandleDecimals(){
        assertEquals(2.5, calculator1.divide(5, 2), 0);
    }
}
