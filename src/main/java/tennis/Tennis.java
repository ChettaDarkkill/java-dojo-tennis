package tennis;

public class Tennis {

    public String getScore(int playerOneScore, int playerTwoScore) {
        if(playerOneScore == 15) {
            return "fifteen,love";
        }
        if(playerTwoScore == 15) {
            return "love,fifteen";
        }
        return "all Love";
    }
}
