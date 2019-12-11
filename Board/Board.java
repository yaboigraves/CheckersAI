package Board;
public class Board{
    Square[][] board = new Square[8][8];
    public Board(){
        initBoard();
    }

    private void initBoard(){
        String[] letters = new String[]{"A","B", "C", "D", "E", "F", "G", "H"};
        Boolean white = true;
        for(int i = 0; i < board.length;i++){
            for (int j = 0; j < board[i].length;j++){
                String col = "";
                if(white){
                    col = ". ";
                }
                else{
                    col = ", ";
                }
                white = !white;
                board[i][j] = new Square(letters[i] + Integer.toString(j), col);
            }
        }
    }

    public void displayBoard(){
        for(int i = 0; i < board.length;i++){
            for (int j = 0; j < board[i].length;j++){
                board[i][j].displaySquare();

            }
            System.out.println("");
        }
    }
}