package rockscissorspaper;

import rockscissorspaper.players.Player;
import rockscissorspaper.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Round {

    Shape shapes[];
    private int myRoundNumber;
    private static int p1Score;
    private static int p2Score;
    private Player player1;
    private Player player2;


    public Round(List<Integer> score, int numberOfRound, ArrayList<Player> player){
        shapes = new Shape[3];
        this.shapes = new Shape[3];
        Round.p1Score = (int) score.get(0);
        Round.p2Score = (int) score.get(1);
        this.player1 = (Player) player.get(0);
        this.player2 = (Player) player.get(1);
        this.myRoundNumber = numberOfRound;
        runningRound();
    }

    private void runningRound(){
        Shape p1option;
        Shape p2option;

        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                "#ROUND " + myRoundNumber + ":\n" +
                "#LIVE SCORE: P1 = " + p1Score + " || P2 = " + p2Score +
                "\n#====================================================");
        System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");
        //esta linea que me devuelva un shape y comparo shapes
        p1option = player1.chooseAShape();
        shapes[0] = p1option;
        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
        //esta linea que me devuelva un shape y comparo shapes
        p2option = player2.chooseAShape();
        shapes[1] = p2option;
        checkWinnerOfTheRound(p1option, p2option);
    }

    private void checkWinnerOfTheRound(Shape p1option, Shape p2option){
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        //reglas del juego
        //player1Shape vs player2Shape
        if( (p1option.toString() == "Paper" && p2option.toString()== "Rock") ){
            updateScoreGame(1);
                    }
        if( (p1option.toString() == "Paper" && p2option.toString()== "Scissors") ){
            updateScoreGame(2);
                    }
        if( (p1option.toString() == "Paper" && p2option.toString()== "paper") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Rock") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Rock" && p2option.toString()== "Scissors") ){
            updateScoreGame(1);
                    }
        if( (p1option.toString() == "Rock" && p2option.toString()== "paper") ){
            updateScoreGame(2);
            
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Rock") ){
            updateScoreGame(2);
            
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "Scissors") ){
            updateScoreGame(3);
        }
        if( (p1option.toString() == "Scissors" && p2option.toString()== "paper") ){
            updateScoreGame(1);
            
        }
    }

    private void updateScoreGame(int assingPoint){
        if(assingPoint == 1){
            p1Score++;
        }
        if(assingPoint == 2){
            p2Score++;
        }
        if(assingPoint == 3){
            p1Score++;
            p2Score++;
        }
    }

    public List<Integer> returnScoreInfo(){
        List<Integer> myList = new ArrayList<>();
        myList.add(0, p1Score);
        myList.add(1, p2Score);
        return myList;
    }
}
