package tennis;

public class Tennis {

    private static int zero = 0;

    private static int fifteenPoint = 15;

    private static int thirtyPoint = 30;

    private static int fortyPoint = 40;


    public String getScore(int playerOneScore, int playerTwoScore) {
        if(playerOneScore == fifteenPoint && playerTwoScore == zero) {
            return "fifteen,love";
        }
        if(playerOneScore == zero && playerTwoScore == fifteenPoint) {
            return "love,fifteen";
        }
        if(playerOneScore == thirtyPoint && playerTwoScore == zero) {
            return "thirty,love";
        }
        if(playerOneScore == zero && playerTwoScore == thirtyPoint) {
            return "love,thirty";
        }
        if(playerOneScore == fortyPoint && playerTwoScore == zero) {
            return "forty,love";
        }
        if(playerOneScore == zero && playerTwoScore == fortyPoint) {
            return "love,forty";
        }
        return "all Love";
    }
}
