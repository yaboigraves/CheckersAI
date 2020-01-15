package Board;
import java.util.Scanner;

public class Inputmanager{
    String[] arrofword;


    public String[] parseinput(){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while(valid == false){
            String word = scanner.nextLine();
            arrofword = word.split(" ");

            for(int i = 0;i<arrofword.length;i++){
                if(arrofword[i].length() < 3){
                    valid = true;
                }
            }

        }
        return arrofword;
    }
    public  Integer[] findCoord(String coord){
        String[] letters = new String[]{"A","B", "C", "D", "E", "F", "G", "H"};
        Character sletter = coord.charAt(0);
        int sx = -1;
        boolean found = false;
        while(found == false){
            if(String.valueOf(sletter) == letters[sx]){
                found = true;
            }
            sx++;
        }
        Character snumber = coord.charAt(1);
        int sy = Integer.valueOf(snumber)- 1;
        Integer[] coord1 = new Integer[]{sx, sy};
        return coord1;
    }
    public void getMove(String[] arrofword,Board board1){
        String startingCoord = arrofword[0];
        String endingCoord = arrofword[1];




        // if(board1.board[0][0].hasPiece() == true){
        // }

    }
}