import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                return;
            }else if(command.equals("Add")){
                addBird(birds, scan);
            }
        }
    }
    
    public static void addBird(ArrayList<Bird> birds, Scanner scan){
        String name, latinName;
        System.out.print("Name: ");
        name = scan.nextLine();
        
        System.out.print("Name in Latin: ");
        latinName = scan.nextLine();
        
        birds.add(new Bird(name, latinName, 0));
    }
}