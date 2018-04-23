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
    
    /**
     *
     */
    public Coin(){
        value = 0;
        statePic = 0;
        location.setX(0);
        location.setY(0);
    } 
    
    /**
     *
     * @param value
     * @param x
     * @param y
     */
    public Coin(int value, int x, int y){
        location.setX(x);
        location.setY(y);
        this.value = value;
        statePic = 0;
    }
    
    /**
     *
     * @param x
     */
    public void setX(int x){location.setX(x);}

    /**
     *
     * @param y
     */
    public void setY(int y){location.setY(y);}

    /**
     *
     * @return
     */
    public int getX(){return location.getX();}

    /**
     *
     * @return
     */
    public int getY(){return location.getY();}
    
    //void Move(double deltatime); //Selalu move ke bawah

    /**
     *
     * @return
     */
    
    public long getValue(){
        return value;
    }
    
    /**
     *
     * @param v
     */
    public void setValue(long v) {
        value = v;
    }
    
    /**
     *
     * @param s
     */
    public void printCoin(String[] s){
        
    }
    
    /**
     *
     * @return
     */
    public int getStatePic(){
        return statePic;
    }

    /**
     *
     * @param sp
     */
    public void setStatePic(int sp){
        statePic = sp;
    }
}
