package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CalculatorTest {

    private CalculatorInterface calc;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calc = (CalculatorInterface)ctx.getBean("calc");
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
    @Test
    public void testAdd() throws Exception {
        int result = calc.add(5,5);
        Assert.assertEquals(result,10 + " Sum of two numbers 5 +5 is 10");
    }


}
