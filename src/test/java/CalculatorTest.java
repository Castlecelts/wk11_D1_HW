import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculatorAnswer;

    @Before
    public void before(){
        calculatorAnswer = new Calculator(55, 8);
    }

    @Test
    public void canAdd(){
        assertEquals(63, calculatorAnswer.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(47, calculatorAnswer.subtract(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(440, calculatorAnswer.multiply(),0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(6.875, calculatorAnswer.divide(), 0.01);
    }
}
