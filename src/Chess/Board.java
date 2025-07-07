package Chess;

public class Board {
    final Cell [][] board;
    Board() {
        board = new Cell[8][8];
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public boolean movePiece(Move move) {
        Piece piece = move.getStart().getPiece();
        if(piece.canMove(move) == false) {
         return false;
        }
        move.getStart().setPiece(null);
        move.getEnd().setPiece(piece);
        return true;
    }

    public Piece getPiece(int row, int col) {
        return board[row][col].getPiece();
    }

    public void setPiece(int row, int col, Piece piece) {
        board[row][col].setPiece(piece);
    }

    public boolean isCheckMate(Color color) {
        return false;
    }

    public boolean isStalemate(Color color) {
        return false;
    }
}
