package rockscissorspaper.players;

import rockscissorspaper.shapes.Paper;
import rockscissorspaper.shapes.Rock;
import rockscissorspaper.shapes.Scissor;
import rockscissorspaper.shapes.Shape;

import java.util.Random;

public class ComputerPlayer extends Player {

    /**
     * esta clase debe de ser capaz de mandar una opcion seleccionada al azar hacia quien?
     * hacia Round
     * con solo ejecutar el metodo chooseAShape() debo retornar una opcion y recibirla en Round
     */

    @Override
    public Shape chooseAShape() {
        Random myRandom = new Random();
        int option = myRandom.nextInt(3) + 1;
        return switch (option){
            case 1 -> new Rock();
            case 2 -> new Scissor();
            case 3 -> new Paper();
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }

    @Override
    public String toString() {
        return "ComputerPlayer";
    }


}
