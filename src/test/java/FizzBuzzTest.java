import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz exampleFizzBuzz;

    @Before
    public void setUp() throws Exception {
        exampleFizzBuzz = new FizzBuzz();

    }

    @Test
    public void NumberOneShouldReturnOne(){
        assertEquals("1", exampleFizzBuzz.transformNumber(1));
    }

    @Test
    public void NumberTwoShouldReturnTwo(){
        assertEquals("2", exampleFizzBuzz.transformNumber(2));
    }
}