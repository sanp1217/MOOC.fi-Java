
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String longestS = "", stringInput;
        int inputStringLength, longest = 0;

        //variables for average for years:
        int sum = 0, count = 0;
        while(!input.isEmpty()){
            String[] parts = input.split(",");
            inputStringLength = input.length();
            stringInput = parts[0];
            
            sum = sum + Integer.valueOf(parts[1]);
            count++;

            if(inputStringLength > longest){
                longest = inputStringLength;
                longestS = stringInput;
            }


            input = scanner.nextLine();
        }

        System.out.println("Longest name: " + longestS);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
