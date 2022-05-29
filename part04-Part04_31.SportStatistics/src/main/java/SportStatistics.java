
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File: ");
        String file = scan.nextLine();
        
        System.out.print("Team: ");
        String team = scan.nextLine();
        
        
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
            
                String[] parts = line.split(",");
                String homeTeams = parts[0];
                String visitingTeams = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
            
                if(homeTeams.equals(team)){
                    count++;
                    if(homePoints > awayPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                    
                }
                if(visitingTeams.equals(team)){
                    count++;
                    if(awayPoints > homePoints){
                        wins++;
                    }
                    
                }
                
                
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

}
