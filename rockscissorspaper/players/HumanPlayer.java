package rockscissorspaper.players;

import rockscissorspaper.Console;
import rockscissorspaper.shapes.Paper;
import rockscissorspaper.shapes.Rock;
import rockscissorspaper.shapes.Scissor;
import rockscissorspaper.shapes.Shape;

public class HumanPlayer extends Player {

    @Override
    public Shape chooseAShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        return switch (option){
            case 1 -> new Rock();
            case 2 -> new Scissor();
            case 3 -> new Paper();
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }

    @Override
    public String toString() {
        return "HumanPlayer";
    }
}
