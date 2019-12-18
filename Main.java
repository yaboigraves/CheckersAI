import Board.*;
// import Board.Inputmanager;

class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.displayBoard();
        Inputmanager inputm = new Inputmanager();
        inputm.parseinput();
    }
}