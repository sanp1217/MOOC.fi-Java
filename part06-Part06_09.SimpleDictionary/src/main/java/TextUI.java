import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary simpledict){
        this.scanner = scanner;
        this.simpleDict = simpledict;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.matches("end")){
                System.out.println("Bye bye!");
                return;
            }
            
            else if(command.matches("add")){
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                
                this.simpleDict.add(word, translation);
            }
            
            else if(command.matches("search")){
                System.out.print("To be translated: ");
                String wordTranslated = this.scanner.nextLine();
                String translation = this.simpleDict.translate(wordTranslated);
                
                if(translation == null){
                    System.out.println("Word " + wordTranslated + " was not found.");
                }else{
                    System.out.println(this.simpleDict.translate(wordTranslated));
                }
                
                
            }
          
            else{
                System.out.println("Unknown command");
            }
        }
        
        
        
        
    }
}
