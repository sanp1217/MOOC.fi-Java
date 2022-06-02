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
                    //assign recipe parts through a method.
                }
            }
            
            if(!linesFromFile.isEmpty()){
                //assign recipe parts through a method.
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage() + e.getStackTrace());
        }
    }
}
