/*
    ArkavQuarium
 */
package Animal;

import Location.*;
import Movable.*;
import Coin.*;

/**
 *
 * @author Uslaconi
 */
public abstract class Fish extends Thread implements Movable {
    private static final int INTERVAL_TO_DIE = 8000;
    private static final int INTERVAL_TO_FULL = 10000;
    public static final int SPEED_FISH_NORMAL = 87;
    
    private double directionTo;
    private boolean isFull;
    private Location location;
    private double timeDirection;
    private int statePic;
    private int ID;
    private double hungerTime;
    private Thread t;
    
    public Fish(int id) {
        this.ID = id;
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
    
    public double getTimeDirection() {
        return this.timeDirection;
    }
    public void setTimeDirection(double td) {
        this.timeDirection = td;
    }
        
    public int getStatePic() {
        return this.statePic;
    }
    public void setStatePic (int sp) {
        this.statePic = sp;
    }
    
    public abstract Coin generateCoin();
    public abstract void Eat();
    
    @Override
    public void Move(double degree, double deltatime){
        if (this.directionTo == -1 || !this.getIsFull()){
            directionTo = degree;
        }
        /*boolean isInsideX = ((this.location.getX() + this.SPEED_FISH_NORMAL * ));
        bool isInsideX = ((location.x + int(SPEED_FISH_NORMAL *  * cos(directionTo * (M_PI / 180)))) <= SCREEN_WIDTH - 40) && ((location.x + int(SPEED_FISH_NORMAL * deltatime * cos(directionTo * (M_PI / 180)))) >= 40);
        bool isInsideY = ((location.y + int(SPEED_FISH_NORMAL * deltatime * sin(directionTo * (M_PI / 180)))) <= SCREEN_HEIGHT - 40) && ((location.y + int(SPEED_FISH_NORMAL * deltatime * sin(directionTo * (M_PI / 180)))) >= 115); */
    }
    
    public void setIsFull(boolean isf) {
        this.isFull = isf;
    }
    public boolean getIsFull() {
        return this.isFull;
    }
    
    public void setHungerTime(long ht) {
        this.hungerTime = ht;
    }
    public double getHungerTime () {
        return this.hungerTime;
    }
    
    public void setID(int id) {
        this.ID = id;
    }
    public int getID () {
        return this.ID;
    }
    public void setDirectionTo(double dt) {
        this.directionTo = dt;
    }
    public double getDirection() {
        return this.directionTo;
    }
    
    public abstract void printFish(String[] s);
    public abstract void findNearestFood();
}
