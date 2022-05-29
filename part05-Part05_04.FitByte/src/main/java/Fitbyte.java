
public class Fitbyte {
    private double age, restHeartRate;
    
    
    public Fitbyte(int age, int restHeartRate){
         this.age = age;
         this.restHeartRate = restHeartRate;
    }
    
    
    
    public double maxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (this.maxHeartRate() - restHeartRate) * (percentageOfMaximum) + restHeartRate;
    }
}
