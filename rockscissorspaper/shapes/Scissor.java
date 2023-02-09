package rockscissorspaper.shapes;

public class Scissor extends Shape{

    public Scissor(){
        this.isShapeSelected = true;
    }

    @Override
    public boolean selectedShape() {
        return isShapeSelected;
    }

    @Override
    public String toString() {
        return "Scissors";
    }
}
