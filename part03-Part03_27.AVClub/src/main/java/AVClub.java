
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.isEmpty()){
            String[] inputSplit = input.split(" ");

            for(int i = 0; i < inputSplit.length; i++){
                String s = inputSplit[i];
                if(s.contains("av")){
                    System.out.println(s);
                    
                }
            }
            input = scanner.nextLine();
        }

    }
}
