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

    @Test
    public void testPlayerOneOrTwoGetSecondBall() {
        String score1 = this.tennis.getScore(30,0);
        assertEquals("thirty,love", score1);

        String score2 = this.tennis.getScore(0, 30);
        assertEquals("love,thirty", score2);
    }

    @Test
    public  void testPlayerOneOrTwoGetThirdBall() {
        String score1 = this.tennis.getScore(40, 0);
        assertEquals("forty,love", score1);

        String score2 = this.tennis.getScore(0, 40);
        assertEquals("love,forty", score2);
    }
}
