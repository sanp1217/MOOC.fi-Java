
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0, containerTwo = 0;


        while (true) {
            System.out.print("First: " + containerOne + "/100\n");
            System.out.print("Second: " + containerTwo + "/100\n");
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            
            //adding to container one only, cant be bigger than 100 or less than 0.
            if(command.equals("add")){
                if((containerOne + amount) > 100){
                    containerOne = 100;
                    continue;
                }
                else if(amount < 0){
                    continue;
                }
                containerOne += amount;
            }
            
            //moving from first container to second. if program requests more than in container one,
            //move all remaining liquid. No more than 100.
            if(command.equals("move")){
                if(amount < 0){
                    continue;
                }
                if((amount + containerTwo) > 100){
                    containerTwo = 100;
                    containerOne = 0;
                }
                if(amount > containerOne){
                    containerTwo += containerOne;
                    containerOne = 0;
                }else{
                    containerOne -= amount;
                    containerTwo += amount;
                }
                
            }
            
            if(command.equals("remove")){
                if(amount < 0){
                    continue;
                }
                if((containerTwo - amount) < 0){
                    containerTwo = 0;
                }else{
                    containerTwo -= amount;
                }
                
            }
            

        }
    }

}
