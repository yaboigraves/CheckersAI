package Piece;

public class Piece{
    String color;
    Boolean isKing;
    char pieceChar;

    public Piece(String colorArg){

        color = colorArg;
        isKing = false;
        if (color == "white"){
            pieceChar = 'w';
            if (isKing == true){
                 pieceChar = 'W';
            }
        }
        if (color != "white"){
            pieceChar = 'b';
            if (isKing == true){
                pieceChar = 'B';
            }
        } 
        
    }

         

    public char getPieceChar(){
        return pieceChar;
    }

    
    public String  getColor(){
        return color;
    }
    
}