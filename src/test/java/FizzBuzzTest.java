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

    @Test
    public void NumberThreeShouldReturnFizz(){
        assertEquals("Fizz", exampleFizzBuzz.transformNumber(3));
    }

    @Test
    public void NumberFiveShouldReturnBuzz(){
        assertEquals("Buzz", exampleFizzBuzz.transformNumber(5));
    }

    @Test
    public void NumberSixShouldReturnFizz(){
        assertEquals("Fizz", exampleFizzBuzz.transformNumber(6));
    }

    @Test
    public void NumberTenShouldReturnBuzz(){
        assertEquals("Buzz", exampleFizzBuzz.transformNumber(10));
    }

    @Test
    public void Number15ShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", exampleFizzBuzz.transformNumber(15));
    }
}