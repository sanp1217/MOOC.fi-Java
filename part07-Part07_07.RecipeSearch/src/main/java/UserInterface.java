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
        System.out.println("Commands: " + "\nlist - lists the recipes" + "\nstop - stops the program" + "\nfind name - searches recipes by name");
        
        while(true){
            System.out.print("\nEnter command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")){
                return;
            }else if(command.equals("list")){
                listRecipes(this.recipes);
            }else if(command.equals("find name")){
                //error: Only outputs one item, implement so it prints all items with nametofind.
                System.out.print("Searched word: ");
                String nameToFind = scanner.nextLine();
                searchByName(recipes, nameToFind);
            }
        }
    }
    
    private void listRecipes(ArrayList<Recipe> recipes){
        for(int i = 0; i < recipes.size(); i++){
            System.out.println(recipes.get(i).toString());
        }
    }
    
    private void searchByName(ArrayList<Recipe> recipes, String searchedName){
        System.out.println("\nRecipes: ");
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getName().contains(searchedName)){
                System.out.println(recipes.get(i).toString());
            }
        }
    }
}