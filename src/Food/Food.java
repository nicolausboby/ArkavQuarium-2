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
    
    /**
     *
     * @return
     */
    public boolean getIsReachBottom() {
        return isReachBottom;
    }
    
    /**
     *
     * @param isReachBottom
     */
    public void setIsReachBottom(boolean isReachBottom){
        this.isReachBottom = isReachBottom;
    }
    
    /**
     *
     * @param x
     */
    public void setX(int x){
        location.setX(x);
    }
    
    /**
     *
     * @param y
     */
    public void setY(int y){
        location.setY(y);
    }
    
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
    
    /**
     *
     */
    public void Move(){}
}
