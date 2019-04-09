package fizzbuzz;

import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1WhenEnter1() {
        assertEquals(1,this.fizzBuzz.calculateData((1)));
    }
}
