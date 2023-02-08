public class RpsGame {

    Player playerA;
    Player playerB;
    Score score;
    Rounds rounds;
    Match match;

    public RpsGame(Player playerA, Player playerB, Score score, Rounds rounds, Match match) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.score = score;
        this.rounds = rounds;
        this.match = match;
    }

    public void prepareGame() {
        rounds.clearGame();
        match.setGame();
        playerA.choosePlayer();
        playerB.choosePlayer();
        rounds.startGame();
    }

}