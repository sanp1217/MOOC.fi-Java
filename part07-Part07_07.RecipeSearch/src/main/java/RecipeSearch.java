import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> linesFromFile = new ArrayList<>();
        
        //
        try (Scanner scanner = new Scanner(Paths.get("recipes.txt"))){
            while(scanner.hasNextLine()){
                String fileLine = scanner.nextLine();
                if(!fileLine.isEmpty()){
                    linesFromFile.add(fileLine);
                }else{
                    assignRecipeParts(recipes, linesFromFile);
                }
            }
            
            if(!linesFromFile.isEmpty()){
                assignRecipeParts(recipes, linesFromFile);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage() + e.getStackTrace());
        }
    }
    
    //To assign the name, cooking time, and ingredients to a recipe.
    static void assignRecipeParts(ArrayList<Recipe> recipes, ArrayList<String> linesFromFile){
        Recipe recipe = new Recipe();
        
        //The first element is always the name.
        String name = linesFromFile.get(0);
        recipe.setName(name);
        
        //The second is always the cook time.
        int cookTime = Integer.valueOf(linesFromFile.get(1));
        recipe.setCookTime(cookTime);
        
        //The rest of the elements are ingredients.
        for(int i = 2; i < linesFromFile.size(); i++){
            recipe.addIngredient(linesFromFile.get(i));
        }
        
        recipes.add(recipe);
        linesFromFile.clear();
    }

}
