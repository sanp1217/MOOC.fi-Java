
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Which file should have its contents printed? ");
        String file = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String read = fileScanner.nextLine();
                System.out.println(read);
            }
        }
        
        catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
