import LoopsAndOperations.ProblemSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LoopsAndOperationsTest {
    ProblemSet problemSet;

    @Before
    public void setUp()  {
        problemSet = new ProblemSet();
    }

    @Test
    public void calculateTest() {
        Assert.assertEquals(3,problemSet.calculate('/',6,2));
        Assert.assertEquals(12, problemSet.calculate('*',6,2));
        Assert.assertEquals(-3, problemSet.calculate('-',3,6));
        Assert.assertEquals(9, problemSet.calculate('+',6,3));
    }

    @Test
    public void fibTest() {
        Assert.assertEquals(0,problemSet.fib(0));
        Assert.assertEquals(34,problemSet.fib(9));
        Assert.assertEquals(13,problemSet.fib(7));
    }

    @Test
    public void fizzBuzzTest() {
        Assert.assertArrayEquals(new String[]{"0","1","2","fizz","4","fizzbuzz"},problemSet.fizzBuzz(6));
        Assert.assertEquals("fizzbuzz",problemSet.fizzBuzz(16)[15]);
    }

}
