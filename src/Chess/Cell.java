package Chess;

public class Cell {
    private final int row;
    private final int col;
    Piece piece;
    Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isOccupied() {
        return piece != null;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}
