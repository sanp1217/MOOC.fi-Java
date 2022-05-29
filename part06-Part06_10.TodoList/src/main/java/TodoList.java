
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> toDo = new ArrayList<>();
    
    public TodoList(){
        
    }
    
    public void add(String task){
        this.toDo.add(task);
    }
    
    public void print(){
        int index = 0;
        for(String s: this.toDo){
            System.out.println((index + 1) + ": " + s);
            index++;
        }
    }
    
    public void remove(int number){
        this.toDo.remove(number - 1);
    }
        
}
