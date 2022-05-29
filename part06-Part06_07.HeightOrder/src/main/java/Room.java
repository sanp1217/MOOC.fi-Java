
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        if(this.people.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        
        Person returnPerson = this.people.get(0);
        
        for(Person prs: this.people){
            if(returnPerson.getHeight() > prs.getHeight()){
                returnPerson = prs;
            }
        }
        
        return returnPerson;
    }
    
    public Person take(){
        Person returnPerson = shortest();
        
        this.people.remove(returnPerson);
        
        return returnPerson;
        
        
    }
    
    
        
        
    
    
    
}
