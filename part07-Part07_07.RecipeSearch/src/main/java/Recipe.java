import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    //Constructor
    public Recipe(){
        this.name = "No name";
        this.cookTime = 0;
    }
    
    //Overloaded
    public Recipe(String name, int cookTime){
        this.name = name;
        this.cookTime = cookTime;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getCookTime(){
        return this.cookTime;
    }
    
    public void setCookTime(int time){
        this.cookTime = time;
    }
    
    public String getIngredient(int index){
        return this.ingredients.get(index);
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public void printIngredients(){
        for(String ing: this.ingredients){
            System.out.println(ing);
        }
    }
}
