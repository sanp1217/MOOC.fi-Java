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
            }else if(command.equals("All")){
                printBirds(birds);
            }else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                addObservation(birds, bird);
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
    
    public static void printBirds(ArrayList<Bird> birds){
        for(Bird bird: birds){
            System.out.println(bird.toString());
        }
    }
    
    public static void addObservation(ArrayList<Bird> birds, String name){
        for(int i = 0; i < birds.size(); i++){
            if(birds.get(i).getName().equals(name)){
                birds.get(i).addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}