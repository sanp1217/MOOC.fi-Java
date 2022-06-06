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
        System.out.println("Commands: " + "\nlist - lists the recipes" + "\nstop - stops the program" + "\nfind name - searches recipes by name"
        + "\nfind cooking time - searches recipes by cooking time" + "\nfind ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.print("\nEnter command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")){
                return;
                
            }else if(command.equals("list")){
                listRecipes(this.recipes);
                
            }else if(command.equals("find name")){
                System.out.print("Searched word: ");
                String nameToFind = scanner.nextLine();
                searchByName(recipes, nameToFind);
                
            }else if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int cookTime = scanner.nextInt();
                searchByCookTime(recipes, cookTime);
                
            }else if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                searchByIngredient(recipes, ingredient);
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
    
    private void searchByCookTime(ArrayList<Recipe> recipes, int cookTime){
        System.out.println("\nRecipes:");
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getCookTime() <= cookTime){
                System.out.println(recipes.get(i).toString());
            }
        }
    }
    
    private void searchByIngredient(ArrayList<Recipe> recipes, String ingredient){
        System.out.println("\nRecipes:");
        for(int i = 0; i < recipes.size(); i++){
            //A loop in a loop to go thorugh all of the list of ingredients in a recipe.
            for(int j = 0; j < recipes.get(i).getIngredientsSize(); j++){
                if(recipes.get(i).getIngredient(j).equals(ingredient)){
                    System.out.println(recipes.get(i).toString());
                }
            }
        }
    }
}