import java.util.ArrayList;


public class Suitcase {
    private int maxWeight, currentWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0; 
    }
    
    public void addItem(Item item){
        if(item.getWeight() + this.currentWeight > this.maxWeight){
            return;
        }
        this.items.add(item);
        this.currentWeight += item.getWeight();
    }
    
    public void printItems(){
        for(int i = 0; i < this.items.size(); i++){
            System.out.println(this.items.get(i));
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item returnItem = this.items.get(0);
        
        for(Item it:this.items){
            if(returnItem.getWeight() < it.getWeight()){
                returnItem = it;
            }
        }
        return returnItem;
    }
    
    public String toString(){
        if(this.items.size() == 0){
            return "no items " + "(" + this.currentWeight + " kg)";
        }
        else if(this.items.size() == 1){
            return this.items.size() + " item" + " (" + this.currentWeight + " kg)";
        }
        return this.items.size() + " items " + "(" + this.currentWeight + "kg)";
    }
    
    
}
