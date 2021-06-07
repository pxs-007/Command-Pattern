package command;

import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<String,Integer> fruitmap;
    public Order(){
        fruitmap=new HashMap<String,Integer>();
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public HashMap<String,Integer> getFruitmap(){
        return fruitmap;
    }
    public void setFruitmap(String fruitkind,int quantity){
        this.fruitmap.put(fruitkind,quantity);
    }
}
