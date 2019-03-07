package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        CalculatorInterface calc = new CalculatorServiceImpl();
        int result = calc.add(10,20);
        Assert.assertEquals("Add 2+3", 30, result);
    }
}
