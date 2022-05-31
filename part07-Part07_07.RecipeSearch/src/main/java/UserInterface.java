import java.util.Scanner;

public class UserInterface {
    private Recipe recipe;
    private Scanner scanner;
    
    //This class will have the interface for the user to choose commands.
    public UserInterface(Recipe recipe, Scanner scanner){
        this.recipe = recipe;
        this.scanner = scanner;
    }
    
    
}