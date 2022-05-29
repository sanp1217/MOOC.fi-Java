
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container one = new Container();
        Container two = new Container();
        

        while (true) {
            System.out.println("First: " + one.toString());
            System.out.println("Second: " + two.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                one.add(amount);
            }
            
            if(command.equals("move")){
                if(amount > one.contains()){
                    two.add(one.contains());
                    one.remove(amount);
                    
                }else{
                    two.add(amount);
                    one.remove(amount);
                }
            }
            
            if(command.equals("remove")){
                two.remove(amount);
            }

        }
    }

}
