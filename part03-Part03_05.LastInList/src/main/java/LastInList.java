
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            list.add(input);
            
        }
        int lastNum = list.size() - 1;
        System.out.println(list.get(lastNum));

    }
}
