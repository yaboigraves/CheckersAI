package Board;
public class Square{
    String coord, color;
    // Piece piece;
    public Square(String coordarg, String colorarg){
        coord=coordarg;
        color = colorarg;
    }

    public void displaySquare(){
        System.out.print(color);
    }

    public String getCoordinate(){
        return coord;
    }
}