package Chess;

import java.util.Scanner;

public class Chess {
    static Chess chess;
    private Board board;
    private Player player1;
    private Player player2;
    private boolean whitesTurn;

    private Chess() {
        board = new Board();
        whitesTurn = true;
    }

    static Chess getChess() {
        return chess;
    }

    public void setPlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void switchTurn() {
        whitesTurn = !whitesTurn;
    }

    private Move getPlayerMove(Player player) {
        // For simplicity, let's assume the player enters the move via console input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source row: ");
        int sourceRow = scanner.nextInt();
        System.out.print("Enter source column: ");
        int sourceCol = scanner.nextInt();
        System.out.print("Enter destination row: ");
        int destRow = scanner.nextInt();
        System.out.print("Enter destination column: ");
        int destCol = scanner.nextInt();

        Piece piece = board.getPiece(sourceRow, sourceCol);
        if (piece == null || piece.getColor() != player.getColor()) {
            throw new IllegalArgumentException("Invalid piece selection!");
        }

        return new Move(board.getCell(sourceRow, sourceCol), board.getCell(destRow, destCol));
    }

    Player getCurrentPlayer() {
        Player currentPlayer = player1;
        if(!whitesTurn)  {
            currentPlayer = player2;
        }
        return currentPlayer;
    }

    boolean gameOver() {
        Player currentPlayer = getCurrentPlayer();
        return board.isCheckMate(currentPlayer.getColor()) || board.isStalemate(currentPlayer.getColor());
    }

    void startGame() {
        while(!gameOver()) {
            Player currentPlayer = getCurrentPlayer();
            Move move = getPlayerMove(currentPlayer);
            board.movePiece(move);
            switchTurn();
        }
        displayResult();
    }


    private void displayResult() {
        if (board.isCheckMate(Color.WHITE)) {
            System.out.println("Black wins by checkmate!");
        } else if (board.isCheckMate(Color.BLACK)) {
            System.out.println("White wins by checkmate!");
        } else if (board.isStalemate(Color.WHITE) || board.isStalemate(Color.BLACK)) {
            System.out.println("The game ends in a stalemate!");
        }
    }




}
