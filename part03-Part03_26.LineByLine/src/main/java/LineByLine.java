
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        String[] inputSplit = input.split(" ");
        
        for(int i = 0; i < inputSplit.length; i++){
            System.out.println(inputSplit[i]);
        }

    }
}
