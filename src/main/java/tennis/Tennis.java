package tennis;

public class Tennis {

    public String getScore(int playerOneScore, int playerTwoScore) {
        if(playerOneScore == 15 && playerTwoScore == 0) {
            return "fifteen,love";
        }
        if(playerOneScore == 0 && playerTwoScore == 15) {
            return "love,fifteen";
        }
        if(playerOneScore == 30 && playerTwoScore == 0) {
            return "thirty,love";
        }
        if(playerOneScore == 0 && playerTwoScore == 30) {
            return "love,thirty";
        }
        return "all Love";
    }
}
