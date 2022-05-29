
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.isEmpty()){
            String[] iSplit = input.split(" ");
            String first = iSplit[0];
            System.out.println(first);
            input = scanner.nextLine();
        }
        
    }
}
