/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choco
 */
public class item {
    private String identifier;
    private String name;
    
    public item(String id, String name){
        this.identifier = id;
        this.name = name;
    }
    
    public String getId(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        item i = (item) compared;
        
        if(this.identifier.equals(i.identifier)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
   
}
