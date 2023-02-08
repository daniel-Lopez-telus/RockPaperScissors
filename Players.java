public abstract class Players {
    protected int currentScore;
    protected Shapes shapeSelected;

    public abstract void chooseAShape();
    
    public int getCurrentScore() {
        return currentScore;
    }

    public Shapes getShapeSelected() {
        return shapeSelected;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    
}
