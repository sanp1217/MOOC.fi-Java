
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter username: ");
        String username = scanner.nextLine();

        System.out.print("enter password: ");
        String password = scanner.nextLine();

        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }
        else if(username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }
        else{
            System.out.println("Incorrect username or password!");
        }
    }
}
