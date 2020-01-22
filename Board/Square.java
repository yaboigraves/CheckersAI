package Board;
import Piece.Piece;
public class Square{
    String coord, color;
    Piece piece;
    public Square(String coordarg, String colorarg){
        coord = coordarg;
        color = colorarg;
        piece = null;
    }
    public Square(String coordarg, String colorarg, Piece pieceArg){
        coord = coordarg;
        color = colorarg;
        piece = pieceArg;
    }

    public void displaySquare(){
        if (piece == null){
            System.out.println(color);
        }
        else{
            System.out.println(piece.getPieceChar());
        }
    }

    public String getCoordinate(){
        return coord;
    }
    public boolean hasPiece(){
        if(piece == null){
            return false;
        }
        else{
            return true;
        }
    }
}