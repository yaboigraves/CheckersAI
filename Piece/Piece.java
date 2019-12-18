package Piece;

public class Piece{
    String color;
    Boolean isKing;
    public Piece(String colorArg){

         color = colorArg;
         isKing = false;


    }
    public String  getColor(){
        return color;
    }
    
}