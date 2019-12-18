package Board;
import java.util.Scanner;

public class Inputmanager{
    String[] arrofword;
    public String[] parseinput(){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while(valid == false){
            String word = scanner.nextLine();
            valid = true;
            arrofword = word.split(" ");

            for(int i = 0;i<arrofword.length;i++){
                if(arrofword[i].length() < 3){
                    valid = true;
                }
            }

        }
        return arrofword;
    }
}