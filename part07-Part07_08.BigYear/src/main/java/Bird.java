public class Bird {
    private String name, latinName;
    private int countObserved;
    
    public Bird(String name, String latinName, int countObserved){
        this.name = name;
        this.latinName = latinName;
        this.countObserved = countObserved;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setLatinName(String name){
        this.latinName = name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void addObservation(){
        this.countObserved++;
    }
    
    public int getObservations(){
        return this.countObserved;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.countObserved + " observations"; 
    }
}
