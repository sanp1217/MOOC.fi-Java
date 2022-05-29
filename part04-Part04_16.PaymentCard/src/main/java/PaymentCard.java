
public class PaymentCard {
    private double balance;
    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }
    
    public void eatAffordably(){
        if(this.balance - 2.60 >= 0){
            this.balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily(){
        if(this.balance - 4.60 >= 0){
            this.balance = this.balance - 4.60;
        }
    }
    
    public void addMoney(double amount){
        if(amount < 0){
            return;
        }
        this.balance += amount;
        if(this.balance >= 150){
            this.balance = 150;
        }
    }
    
    public String toString(){
        return ("The card has a balance of " + this.balance + " euros");
    }
}
