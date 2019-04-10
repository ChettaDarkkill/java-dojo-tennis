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
        String score = this.tennis.getScore();
        assertEquals("All Love", score);
    }
}
