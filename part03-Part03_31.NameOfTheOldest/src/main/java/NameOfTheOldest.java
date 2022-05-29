
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
        int age = 0;
        int biggest = 0;
        String oldestInput, oldest = "";
        while(!input.isEmpty()){
            String[] parts = input.split(",");
            
            age = Integer.valueOf(parts[1]);
            oldestInput = parts[0];
            if(age > biggest){
                biggest = age;
                oldest = oldestInput;
            }
            input = scanner.nextLine();
        }

        
        System.out.println("Name of the oldest: " + oldest);
        

    }
}
