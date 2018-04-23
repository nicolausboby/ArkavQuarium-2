/*
 * ArkavQuarium
 * 
 */
package Food;

import Location.*;
/**
 *
 * @author aldoazali
 */

public class Food {
	//Konstanta
	private int SPEED_COIN_FOOD = 85;
	private int SCREEN_WIDTH = 640;
	private int SCREEN_HEIGHT = 480;
	
    private Location location;
    private int statePic;
    private boolean isReachBottom;
    
    public Food() {
    	this.statePic = 0;
    	this.isReachBottom = false;
    	this.location.setX(0);
    	this.location.setY(0);
    }
    
    public Food(int x,int y) { //Location Food
    	this.statePic = 0;
    	this.isReachBottom = false;
    	this.location.setX(x);
    	this.location.setY(y);
    }
    
    public boolean isNotSameObject(Food f){
    	return (this == f);
    }
    
    // Setter and Getter Attribute Food
    public int getStatePic() {
    	return statePic;
    }
    public void setStatePic(int state) {
    	this.statePic = state;
    }
     
    public int getX() {
    	return this.getX();
    }
    public void setX(int x) {
    	this.setX(x);
    }
    public int getY() {
    	return this.getY();
    }
    public void setY(int y) {
    	this.setY(y);
    }
    
    //Get & Set isReachBottom
    public void setIsReachBottom(boolean reachBottom) {
    	this.isReachBottom = reachBottom;
    }
    public boolean getIsReachBottom(){
    	return  isReachBottom;
    }
    
}
