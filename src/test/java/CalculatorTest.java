
import com.mycompany.calcularot.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void scitajTest() {
        Calculator calculator = new Calculator();

        long sucet = calculator.scitaj(5, 4);

        Assert.assertEquals(9, sucet);
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void scitajTest2() {
        Calculator calculator = new Calculator();

        long sucet = calculator.scitaj(2000000000, 2000000000);

        Assert.assertEquals(4000000000L, sucet);
    }
}
