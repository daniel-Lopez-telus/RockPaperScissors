package rockscissorspaper.shapes;

public class Paper extends Shape{

    public Paper(){
        this.isShapeSelected = true;
    }

    @Override
    public boolean selectedShape() {
        return isShapeSelected;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}
