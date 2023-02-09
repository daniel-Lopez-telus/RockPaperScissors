package rockscissorspaper.shapes;

public class Rock extends Shape{

    public Rock(){
        this.isShapeSelected = true;
    }

    @Override
    public boolean selectedShape() {
        return isShapeSelected;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
