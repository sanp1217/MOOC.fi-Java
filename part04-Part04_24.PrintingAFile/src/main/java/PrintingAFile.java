
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
            
            while(scanner.hasNextLine()){
                String reading = scanner.nextLine();
                System.out.println(reading);
            }
            
            
        }
        
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
