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
        String score = this.tennis.getScore(0,0);
        assertEquals("all Love", score);
    }

    @Test
    public void testPlayerOneOrTwoFirstBall() {
        String score1 = this.tennis.getScore(15,0);
        assertEquals("fifteen,love", score1);

        String score2 = this.tennis.getScore(0,15);
        assertEquals("love,fifteen", score2);
    }
}
