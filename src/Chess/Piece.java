package Chess;

public abstract class Piece {
    Color color;
    public Piece(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public abstract boolean canMove(Move move);

}
