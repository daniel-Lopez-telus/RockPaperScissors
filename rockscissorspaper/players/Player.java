package rockscissorspaper.players;

import rockscissorspaper.shapes.Shape;

public abstract class Player {

    public abstract Shape chooseAShape();

    public abstract String toString();
}
