public class Recipe {
    private String name;
    private int cookTime;
    
    
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
}
