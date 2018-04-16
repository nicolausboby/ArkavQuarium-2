/*
    ArkavQuarium
 */
package Animal;

import Location.*;

/**
 *
 * @author Uslaconi
 */
public abstract class Fish {
    private static final int INTERVAL_TO_DIE = 8000;
    private static final int INTERVAL_TO_FULL = 10000;
    
    private double directionTo;
    private boolean isFull;
    private Location location;
    private double timeDirection;
    private int statePic;
    private int ID;
    private double hungerTime;
    
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
    
    //public void Move(double a, double b)
    
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
