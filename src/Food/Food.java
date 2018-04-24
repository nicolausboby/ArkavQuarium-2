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
    private int SPEED_COIN_FOOD = 85;
    private int SCREEN_WIDTH = 640;
    private int SCREEN_HEIGHT = 480;
	
    private Location location;
    private int statePic;
    private boolean isReachBottom;
    
    /**
     * This constructs food's instance.
     */
    public Food() {
    	this.statePic = 0;
    	this.isReachBottom = false;
        location = new Location();
    	this.location.setX(0);
    	this.location.setY(0);
    }
    
    /**
     * This constructs instance of food with specified parameter.
     * @param x x-location.
     * @param y y-location.
     */
    public Food(int x,int y) { //Location Food
    	this.statePic = 0;
        location = new Location();
    	this.isReachBottom = false;
    	this.location.setX(x);
    	this.location.setY(y);
    }
    
    @Override
    public boolean equals(Object f){
        final Food food = (Food) f;
    	return location.getX() == food.getX() && location.getY() == food.getY() && statePic == food.statePic;
    }
    
    /**
     * This returns state pic of food.
     * @return state pic.
     */
    public int getStatePic() {
    	return statePic;
    }

    /**
     * THis method sets state with given parameter.
     * @param state state pic of food.
     */
    public void setStatePic(int state) {
    	this.statePic = state;
    }
     
    /**
     * This returns x-location of food.
     * @return x-location.
     */
    public int getX() {
    	return location.getX();
    }

    /**
     * This method sets x-location with given parameter.
     * @param x x-location.
     */
    public void setX(int x) {
    	location.setX(x);
    }

    /**
     * This returns y-location.
     * @return y-location.
     */
    public int getY() {
    	return location.getY();
    }

    /**
     * This method sets y-location with given parameter.
     * @param y y-location.
     */
    public void setY(int y) {
    	location.setY(y);
    }
    
    /**
     * This method sets attribute reachbottom in food. 
     * @param reachBottom reachBottom.
     */
    public void setIsReachBottom(boolean reachBottom) {
    	this.isReachBottom = reachBottom;
    }

    /**
     * This returns attribute reachbottom in food.
     * @return reachbottom.
     */
    public boolean getIsReachBottom(){
    	return  isReachBottom;
    }
    
}
