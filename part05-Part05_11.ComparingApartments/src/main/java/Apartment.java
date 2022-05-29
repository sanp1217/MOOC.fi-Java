
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.getSquares()){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int price;
        int priceOfCompared;
        
        price = this.squares * this.princePerSquare;
        priceOfCompared = compared.getSquares() * compared.getPricePerSquare();
        
        return Math.abs(price - priceOfCompared);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int price, priceOfCompared;
        
        price = this.squares * this.princePerSquare;
        priceOfCompared = compared.getSquares() * compared.getPricePerSquare();
        
        if(price > priceOfCompared){
            return true;
        }
        return false;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getRooms(){
        return this.rooms;
    }
    
    public int getPricePerSquare(){
        return this.princePerSquare;
    }

}
