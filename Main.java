

import Board.Board;
import Piece.Piece;
class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.displayBoard();
        Piece piece = new Piece("white");
        String x = piece.getColor();
        System.out.println(x);
        
    }
}