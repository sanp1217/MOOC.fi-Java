
public class Debt {
    private double balance, interestRate;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println("Balance: " + this.balance);
    } 
    
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}
