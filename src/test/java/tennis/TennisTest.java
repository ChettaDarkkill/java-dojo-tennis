package tennis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TennisTest {

    private Tennis tennis;

    private static int zero = 0;

    private static int fifteenPoint = 15;

    private static int thirtyPoint = 30;

    private static int fortyPoint = 40;


    @Before
    public void setup() {
        this.tennis = new Tennis();
    }

    @Test
    public void testNewGameShouldReturnAllLove() {
        String score = this.tennis.getScore();
        assertEquals("all Love", score);
    }

    @Test
    public void testPlayerOneOrTwoFirstBall() {
        this.tennis.setPlayer1Point(fifteenPoint);
        this.tennis.setPlayer2Point(zero);
        String score1 = this.tennis.getScore();
        assertEquals("fifteen,love", score1);

        this.tennis.setPlayer1Point(zero);
        this.tennis.setPlayer2Point(fifteenPoint);
        String score2 = this.tennis.getScore();
        assertEquals("love,fifteen", score2);
    }

    @Test
    public void testPlayerOneOrTwoGetSecondBall() {
        this.tennis.setPlayer1Point(thirtyPoint);
        this.tennis.setPlayer2Point(zero);
        String score1 = this.tennis.getScore();
        assertEquals("thirty,love", score1);

        this.tennis.setPlayer1Point(zero);
        this.tennis.setPlayer2Point(thirtyPoint);
        String score2 = this.tennis.getScore();
        assertEquals("love,thirty", score2);
    }

    @Test
    public  void testPlayerOneOrTwoGetThirdBall() {
        this.tennis.setPlayer1Point(fortyPoint);
        this.tennis.setPlayer2Point(zero);
        String score1 = this.tennis.getScore();
        assertEquals("forty,love", score1);

        this.tennis.setPlayer1Point(zero);
        this.tennis.setPlayer2Point(fortyPoint);
        String score2 = this.tennis.getScore();
        assertEquals("love,forty", score2);
    }
}
