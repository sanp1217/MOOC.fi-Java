
import java.util.Scanner;
import java.util.Random;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands: \n 1- add a joke \n 2 - draw a joke \n 3 - list jokes \n X - stop");
            String command = this.scanner.nextLine();
            if(command.equals("X")){
                return;
            }else if(command.equals("1")){
                System.out.print("Write the joke to be added: ");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);
            }else if(command.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(this.manager.drawJoke());
            }else if(command.equals("3")){
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
            
        }
    }
    
    
}
