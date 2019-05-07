import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4.0, 2.0);
    }

    @Test
    public void hasNUM1(){
        assertEquals(4.0, calculator.getNum1(), 0.01);
    }

    @Test
    public void hasNUM2(){
        assertEquals(2.0, calculator.getNum2(), 0.01);
    }

    @Test
    public void add(){
        assertEquals(6.0, calculator.add(),0.01);
    }

    @Test
    public void subtract(){
        assertEquals(2.0, calculator.subtract(),0.01);
    }

    @Test
    public void multiply(){
        assertEquals(8.0, calculator.multiply(), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(2.0, calculator.divide(), 0.01);
    }

}
