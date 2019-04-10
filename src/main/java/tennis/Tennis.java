package tennis;

public class Tennis {

    private static int zero = 0;

    private static int fifteenPoint = 15;

    private static int thirtyPoint = 30;

    private static int fortyPoint = 40;

    private int player1Point;

    private int player2Point;


    public String getScore() {
        if(this.player1Point == fifteenPoint && this.player2Point == zero) {
            return "fifteen,love";
        }
        if(this.player1Point == zero && this.player2Point == fifteenPoint) {
            return "love,fifteen";
        }
        if(this.player1Point == thirtyPoint && this.player2Point == zero) {
            return "thirty,love";
        }
        if(this.player1Point == zero && this.player2Point == thirtyPoint) {
            return "love,thirty";
        }
        if(this.player1Point == fortyPoint && this.player2Point == zero) {
            return "forty,love";
        }
        if(this.player1Point == zero && this.player2Point == fortyPoint) {
            return "love,forty";
        }
        return "all Love";
    }

    public void setPlayer1Point(int player1Point) {
        this.player1Point = player1Point;
    }

    public void setPlayer2Point(int player2Point) {
        this.player2Point = player2Point;
    }
}
