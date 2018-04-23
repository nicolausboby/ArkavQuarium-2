/*
 * ArkavQuarium
 * 
 */
package Food;

import Location.Location;

/**
 *
 * @author regipurba
 */
public class Food {
    private Location location;
    private int statePic;
    private boolean isReachBottom;
    
    public boolean getIsReachBottom() {
        return isReachBottom;
    }
    
    public void setIsReachBottom(boolean isReachBottom){
        this.isReachBottom = isReachBottom;
    }
    
    public void setX(int x){
        location.setX(x);
    }
    
    public void setY(int y){
        location.setY(y);
    }
    
    public int getX(){return location.getX();}
    public int getY(){return location.getY();}
    
    public void Move(){}
}
