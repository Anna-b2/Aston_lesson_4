import task.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTestngTest {
    @Test
    public void factorialTest () {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(24, Factorial.calculateFactorial(4));
        assertEquals(120, Factorial.calculateFactorial(5));
    }
}
