
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<item> items = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            item newItem = new item(identifier, name);
            
            if(items.contains(newItem)){
                continue;
            }else items.add(newItem);
            
            
        
        
        }
        
        System.out.println("==Items==");
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).toString());
        }
        
        

    }
}
