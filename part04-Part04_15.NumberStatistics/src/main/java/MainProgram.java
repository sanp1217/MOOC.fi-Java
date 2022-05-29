
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sumsAll = new Statistics();
        Statistics sumsEven = new Statistics();
        Statistics sumsOdd = new Statistics();
        
        
        System.out.println("Enter numbers: ");
        int nums = scanner.nextInt();
        
        while(nums != -1){
            sumsAll.addNumber(nums);
            
            if(nums % 2 == 0){
                sumsEven.addNumber(nums);
            }
            else if(nums % 2 != 0){
                sumsOdd.addNumber(nums);
            }
            
            nums = scanner.nextInt();
        }
        
        System.out.println("Sum: " + sumsAll.sum());
        System.out.println("Sums of even numbers: " + sumsEven.sum());
        System.out.println("Sums of odd numbers: " + sumsOdd.sum());
        
        
        
        
        
        
        
        
        
        
        
    }
}
