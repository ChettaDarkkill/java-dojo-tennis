package tennis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TennisTest {

    private Tennis tennis;

    @Before
    public void setup() {
        this.tennis = new Tennis();
    }

    @Test
    public void testNewGameShouldReturnAllLove() {
        assertEquals("All Love", this.tennis.newGame());
    }
}
