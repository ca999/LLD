package Chess;

public class Move {
    final Cell start;
    final Cell end;
    public Move(Cell start, Cell end) {
        this.start = start;
        this.end = end;
    }
    public Cell getStart() {
        return start;
    }
    public Cell getEnd() {
        return end;
    }
}
