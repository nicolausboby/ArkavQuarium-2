/*
 * ArkavQuarium
 * 
 */
package Coin;

import Location.*;
import Movable.*;

/**
 *
 * @author aldoazali
 */
public class Coin{    
    private int SPEED_COIN_FOOD = 85;
    private int SCREEN_WIDTH = 640;
    private int SCREEN_HEIGHT = 480;
    private int SILVER = 35;
    private int GOLD = 55;
	
    private int statePic;
    private long value;
    private Location location;
    
    @Override
    public boolean equals(Object o){
        final Coin coin = (Coin) o;
        return coin.getX() == location.getX() && coin.getY() == location.getY() && value == coin.getValue() && coin.getStatePic() == statePic;
    }
    
    /**
     * This constructs coin object.
     */
    
    public Coin() {
        location = new Location();
    	this.statePic = 0;
    	this.value = 0;
    	this.location.setX(0);
    	this.location.setY(0);
    }
    
    /**
     * This constructs coin object with specified parameter.
     * @param value Value of coin.
     * @param x x-location.
     * @param y y-location.
     */
    public Coin(int value, int x, int y){
        location = new Location();
        location.setX(x);
        location.setY(y);
        this.value = value;
        statePic = 0;
    }
    
    /**
     * This returns value of coin.
     * @return value.
     */
    public long getValue(){
        return this.value;
    }

    /**
     * This method sets value of coin.
     * @param v value.
     */
    public void setValue(long v) {
        this.value = v;
    }
    
    /**
     * This returns state pic of coin.
     * @return state pic of coin.
     */
    public int getStatePic(){
        return this.statePic;
    }

    /**
     * This method sets state pic of coin.
     * @param sp state of coin.
     */
    public void setStatePic(int sp){
        this.statePic = sp;
    }

    /**
     * This returns x-location of coin.
     * @return x-location.
     */
    public int getX() {
    	return this.location.getX();
    }

    /**
     * This method sets x-location of coin.
     * @param x x-location.
     */
    public void setX(int x) {
    	this.location.setX(x);
    }

    /**
     * This returns y-location of coin.
     * @return
     */
    public int getY() {
    	return this.location.getY();
    }

    /**
     * This method sets y-location of coin.
     * @param y y-location.
     */
    public void setY(int y) {
    	this.location.setY(y);
    }
    
    /**
     * This method prints state of coin.
     * @param coins pics path.
     */
    public void printCoin(String[] coins){
    	if (value == SILVER) {
    	    //draw_image(coins[getStateGambar()], getX(), getY());  //-> menunggu OOP.java dibuat
    	}
    	else if (value == GOLD) {
    	    //draw_image(coins[getStateGambar()+10], getX(), getY());  //-> menunggu OOP.java dibuat
    	}
    	else {
    		//draw_image(coins[getStateGambar()+20], getX(), getY());  //-> menunggu OOP.java dibuat
    	}

    	if (getStatePic() != 9) {
    	    setStatePic(getStatePic() + 1);
    	}
    	else {
    	    setStatePic(0);	
    	}
    }
    
    /**
     * This method moves coin.
     * @param deltatime deltatime.
     */
    public void Move(double deltatime){
    	//MARK -> ukuran coin belum tau, harus ada koreksi nilai lagi
    	boolean isInsideY = ((location.getY() + (int)(SPEED_COIN_FOOD * deltatime * Math.sin(Math.PI / 180))) < SCREEN_HEIGHT - 40);

    	if (isInsideY){
    		location.setY((int)(location.getY()+(SPEED_COIN_FOOD * deltatime * 10 * Math.sin(Math.PI / 180))));
    	}
    } //Selalu move ke bawah
    
}