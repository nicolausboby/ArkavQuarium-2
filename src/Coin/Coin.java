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
	//Konstanta
	private int SPEED_COIN_FOOD = 85;
	private int SCREEN_WIDTH = 640;
	private int SCREEN_HEIGHT = 480;
	private int SILVER = 35;
	private int GOLD = 55;
	
    private int statePic;
    private long value;
    private Location location;
    
    
    //void Move(double deltatime); //Selalu move ke bawah
    
    public Coin() {
    	this.statePic = 0;
    	this.value = 0;
    	this.location.setX(0);
    	this.location.setY(0);
    }
    
    public Coin(int x,int y) {
    	this.statePic = 0;
    	this.value = 0;
    	this.location.setX(x);
    	this.location.setY(y);
    }
    
    //Setter and Getter
    public long getValue(){
        return this.value;
    }
    public void setValue(long v) {
        this.value = v;
    }
    
    public int getStatePic(){
        return this.statePic;
    }
    public void setStatePic(int sp){
        this.statePic = sp;
    }
    public int getX() {
    	return this.location.getX();
    }
    public void setX(int x) {
    	this.location.setX(x);
    }
    public int getY() {
    	return this.location.getY();
    }
    public void setY(int y) {
    	this.location.setY(y);
    }
    
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
    
    public void Move(double deltatime){
    	//MARK -> ukuran coin belum tau, harus ada koreksi nilai lagi
    	boolean isInsideY = ((location.getY() + (int)(SPEED_COIN_FOOD * deltatime * Math.sin(Math.PI / 180))) < SCREEN_HEIGHT - 40);

    	if (isInsideY){
    		location.setY((int)(location.getY()+(SPEED_COIN_FOOD * deltatime * 10 * Math.sin(Math.PI / 180))));
    	}
    } //Selalu move ke bawah
    
}