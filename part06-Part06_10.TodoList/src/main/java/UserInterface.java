
import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equalsIgnoreCase("stop")){
                return;
            }
            else if(command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String add = this.scanner.nextLine();
                
                this.list.add(add);
            }
            else if(command.equalsIgnoreCase("list")){
                this.list.print();
            }
            else if(command.equalsIgnoreCase("remove")){
                System.out.print("Which one is removed? ");
                int removed = this.scanner.nextInt();
                
                this.list.remove(removed);
            }
        }
    }
    
    
    
}
