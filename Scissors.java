public class Scissors extends Shapes {
    private final boolean beatsPaper = true;
    private final boolean beatsRock = false;
    
    public boolean isBeatsPaper() {
        return beatsPaper;
    }
    public boolean isBeatsRock() {
        return beatsRock;
    }
}
