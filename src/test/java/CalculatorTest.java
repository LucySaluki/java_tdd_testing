import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void calculatorCanAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void calculatorCanSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void calculatorCanMultiply(){
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void calculatorCanDivide(){
        assertEquals(2.0, calculator.divide(6.0,3.0), 0.1);
    }
}
