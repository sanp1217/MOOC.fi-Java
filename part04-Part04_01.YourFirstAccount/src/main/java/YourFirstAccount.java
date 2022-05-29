
public class YourFirstAccount {

    public static void main(String[] args) {
        Account pabsAccount = new Account("Pabs account", 100.0);
        pabsAccount.deposit(20.0);
        System.out.println(pabsAccount);
    }
}
