import java.util.ArrayList;


public class Hold {
    private int maxWeight, currentWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.currentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.currentWeight > this.maxWeight){
            return;
        }
        this.hold.add(suitcase);
        this.currentWeight += suitcase.totalWeight();
    }
    
    public void printItems(){
         for(Suitcase sca: this.hold){
             sca.printItems();
         }
    }
    
    public String toString(){
        return this.hold.size() + " suitcases " + "(" + this.currentWeight + " kg)";
    }
}
