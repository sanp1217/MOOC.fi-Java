
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int age = 0;
        int biggest = 0;
        while(!input.isEmpty()){
            String[] parts = input.split(",");
            
            age = Integer.valueOf(parts[1]);
            
            if(age > biggest){
                biggest = age;
            }
            input = scanner.nextLine();
        }

        System.out.println("Age of the oldest: " + biggest);

    }
}
