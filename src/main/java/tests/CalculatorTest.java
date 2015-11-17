package tests;

import com.mycompany.calcularot.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void scitajTest() {
        Calculator calculator = new Calculator();

        int sucet = calculator.scitaj(5, 4);

        Assert.assertEquals(sucet, 9);
    }
}
