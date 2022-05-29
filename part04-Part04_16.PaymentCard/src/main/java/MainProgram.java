
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Pauls: " + paulsCard.toString());
        System.out.println("Matts: " + mattsCard.toString());
        
        paulsCard.addMoney(20.0);
        mattsCard.eatHeartily();
        
        System.out.println("Pauls: " + paulsCard.toString());
        System.out.println("Matts: " + mattsCard.toString());
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50.0);
        
        System.out.println("Pauls: " + paulsCard.toString());
        System.out.println("Matts: " + mattsCard.toString());
        
      

    }
}
