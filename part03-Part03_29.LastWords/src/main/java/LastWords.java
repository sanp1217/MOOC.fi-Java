
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        while(!input.isEmpty()){
            String[] split = input.split(" ");
            //last = split[split.length - 1];
            System.out.println(split[split.length - 1]);
            input = scanner.nextLine();
        }
    }
}
