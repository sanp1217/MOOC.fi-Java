import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //int duration = 0;
        //String nameOfShow;
                
        while(true){
            System.out.print("Name: ");
            String nameOfShow = scanner.nextLine();
            
            if(nameOfShow.isEmpty()){
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            
            programs.add(new TelevisionProgram(nameOfShow, duration));
            
    
        }
        
        System.out.print("\nProgram's maximum duration? ");
        int maxDuration = scanner.nextInt();
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program.toString());
            }
        }
        
        for(int i = 0; i < programs.size(); i++){
            TelevisionProgram program = programs.get(i);
        }

    }
}
