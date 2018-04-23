/*
 * ArkavQuarium
 * 
 */
package Coin;

import Location.*;
import Movable.*;

/**
 *
 * @author Uslaconi
 */
public class Coin{    
    private int statePic;
    private long value;
    private Location location;
    
    
    public Coin(){
        value = 0;
        statePic = 0;
        location.setX(0);
        location.setY(0);
    } 
    
    public Coin(int value, int x, int y){
        location.setX(x);
        location.setY(y);
        this.value = value;
        statePic = 0;
    }
    
    public void setX(int x){location.setX(x);}
    public void setY(int y){location.setY(y);}
    public int getX(){return location.getX();}
    public int getY(){return location.getY();}
    
    //void Move(double deltatime); //Selalu move ke bawah
    
    public long getValue(){
        return value;
    }
    
    public void setValue(long v) {
        value = v;
    }
    
    public void printCoin(String[] s){
        
    }
    
    public int getStatePic(){
        return statePic;
    }
    public void setStatePic(int sp){
        statePic = sp;
    }
}
