
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int searchNum = Integer.valueOf(scanner.nextLine());

        int index = list.size() - 1;
        while(index >= 0){
            int number = list.get(index);
            if(searchNum == number){
                System.out.println(searchNum + " is at index " + index);
}
            
            index--;
}

        
        

        
    }
}
