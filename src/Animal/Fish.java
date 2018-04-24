/*
    ArkavQuarium
 */
package Animal;

import Location.*;
import Movable.*;
import Coin.*;
import java.util.Random;
import static Main.Main.*;

/**
 *
 * @author Uslaconi
 */
public abstract class Fish extends Thread implements Movable {
    public static final int INTERVAL_TO_DIE = 8000;
    public static final int INTERVAL_TO_FULL = 10000;
    public static final int INTERVAL_TIME_DIRECTION = 2000;
    public static final int SPEED_FISH_NORMAL = 87;
    
    private double directionTo;
    private boolean isFull;
    private Location location;
    private double timeDirection;
    private int statePic;
    private int ID;
    private double hungerTime;
    private Thread t;
    
    /**
     * This constructs fish with no param.
     * @param id
     */
    public Fish(int id) {
        location = new Location();
        isFull = true;
        statePic = 0;
        hungerTime = INTERVAL_TO_FULL;
        ID = id;
        directionTo = -1;
    }
    
    @Override
    public void run(){
        
    }
    
    @Override
    public void start() {
        if (t == null) {
            t = new Thread (this, String.valueOf(this.ID));
            t.start ();
        }
    }
    
    /**
     * This method sets x location of fish.
     * @param x X-location.
     */
    public void setX(int x){location.setX(x);}

    /**
     * This method sets y location of fish.
     * @param y Y-location.
     */
    public void setY(int y){location.setY(y);}

    /**
     * This returns x location of fish.
     * @return X-location.
     */
    public int getX(){return location.getX();}

    /**
     * This returns y location of fish.
     * @return Y-location.
     */
    public int getY(){return location.getY();}
    
    /**
     * This returns time direction of fish.
     * @return timeDirection.
     */
    public double getTimeDirection() {
        return this.timeDirection;
    }

    /**
     * This method sets timeDirection of fish with given parameter.
     * @param td timeDirection.
     */
    public void setTimeDirection(double td) {
        this.timeDirection = td;
    }
        
    /**
     * This returns state pic of fish.
     * @return state pic.
     */
    public int getStatePic() {
        return this.statePic;
    }

    /**
     * This method sets state pic of fish.
     * @param sp state pic.
     */
    public void setStatePic (int sp) {
        this.statePic = sp;
    }
    
    /**
     * This returns coin from fish.
     * @return coin
     */
    public abstract Coin generateCoin();
    
    /**
     * This method moves fish with given degree and deltatime.
     * @param degree degree.
     * @param deltatime deltatime.
     */
    @Override
    public void Move(double degree, double deltatime){
        if (this.directionTo == -1 || !this.getIsFull()){
            directionTo = degree;
        }
        boolean isInsideX = ((this.location.getX() + this.SPEED_FISH_NORMAL * deltatime * Math.cos(this.directionTo * (Math.PI / 180))) <= JFXPANEL_WIDTH_INT - 40) && ((this.location.getX() + this.SPEED_FISH_NORMAL * deltatime * Math.cos(this.directionTo * (Math.PI / 180))) >= 40);
        boolean isInsideY = ((this.location.getY() + this.SPEED_FISH_NORMAL * deltatime * Math.sin(this.directionTo * (Math.PI / 180))) <= JFXPANEL_HEIGHT_INT - 40) && ((this.location.getY() + this.SPEED_FISH_NORMAL * deltatime * Math.sin(this.directionTo * (Math.PI / 180))) >= 40);
        while (!(isInsideX && isInsideY)){
            Random rand = new Random();
            directionTo = rand.nextInt(360);
            isInsideX = ((this.location.getX() + this.SPEED_FISH_NORMAL * deltatime * Math.cos(this.directionTo * (Math.PI / 180))) <= JFXPANEL_WIDTH_INT - 40) && ((this.location.getX() + this.SPEED_FISH_NORMAL * deltatime * Math.cos(this.directionTo * (Math.PI / 180))) >= 40);
            isInsideY = ((this.location.getY() + this.SPEED_FISH_NORMAL * deltatime * Math.sin(this.directionTo * (Math.PI / 180))) <= JFXPANEL_HEIGHT_INT - 40) && ((this.location.getY() + this.SPEED_FISH_NORMAL * deltatime * Math.sin(this.directionTo * (Math.PI / 180))) >= 40);
        }

        this.location.setX((int)(this.location.getX() + this.SPEED_FISH_NORMAL * deltatime * Math.cos(this.directionTo * (Math.PI / 180)))); 
        this.location.setY((int)(this.location.getY() + this.SPEED_FISH_NORMAL * deltatime * Math.sin(this.directionTo * (Math.PI / 180)))); 
    }
    
    /**
     * This method sets fish hungry condition.
     * @param isf if true then fish is full.
     */
    public void setIsFull(boolean isf) {
        this.isFull = isf;
    }

    /**
     * This returns fish hungry condition.
     * @return if true then fish if full.
     */
    public boolean getIsFull() {
        return this.isFull;
    }
    
    /**
     * This method sets hunger time of fish.
     * @param ht hunger time.
     */
    public void setHungerTime(long ht) {
        this.hungerTime = ht;
    }

    /**
     * This returns hunger time of fish.
     * @return hunger time.
     */
    public double getHungerTime () {
        return this.hungerTime;
    }
    
    /**
     * This method sets ID of fish.
     * @param id ID.
     */
    public void setID(int id) {
        this.ID = id;
    }

    /**
     * This returns fish's ID.
     * @return ID.
     */
    public int getID () {
        return this.ID;
    }

    /**
     * This method sets direction of fish.
     * @param dt direction of fish.
     */
    public void setDirectionTo(double dt) {
        this.directionTo = dt;
    }

    /**
     * This returns direction of fish.
     * @return directionTo.
     */
    public double getDirection() {
        return this.directionTo;
    }
    
    /**
     * This method prints current fish.
     * @param s pics path.
     */
    public abstract void printFish(String[] s);
    
    @Override
    public boolean equals(Object obj){
        final Fish fish = (Fish) obj;
        return ID == fish.ID && isFull == fish.isFull && location.getX() == fish.location.getX() && location.getY() == fish.location.getY();
    }
}
