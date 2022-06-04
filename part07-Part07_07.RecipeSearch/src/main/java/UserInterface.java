import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    private Scanner scanner;
    
    //This class will have the interface for the user to choose commands.
    public UserInterface(ArrayList<Recipe> recipes, Scanner scanner){
        this.recipes = recipes;
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("Commands: " + "\nlist - lists the recipes" + "\nstop - stops the program");
        
        while(true){
            System.out.print("\nEnter command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")){
                return;
            }else if(command.equals("list")){
                //Method for listing recipes.
            }
        }
    }
    
}