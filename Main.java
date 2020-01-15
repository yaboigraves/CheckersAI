


import Board.Board;
import Piece.Piece;

import Board.*;
// import Board.Inputmanager;

class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.displayBoard();
        Piece piece = new Piece("white");
        String x = piece.getColor();
        System.out.println(x);
       
        Inputmanager inputm = new Inputmanager();
        inputm.parseinput();

    }
}