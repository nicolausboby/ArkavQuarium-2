/*
 * ArkavQuarium
 * 
 */
package Location;

/**
 *
 * @author Uslaconi
 */
public class Location {
    private int x;
    private int y;
    
    /**
     * This returns x-location in Aquarium.
     * @return X location.
     */
    public int getX() {
        return this.x;
    }
    
    /**
     * This returns y-location in Aquarium.
     * @return Y location.
     */
    public int getY() {
        return this.y;
    }
    
    /**
     * This method sets a given parameter to member x.
     * @param x X location.
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * This method sets a given parameter to member y.
     * @param y Y location.
     */
    public void setY(int y) {
        this.y = y;
    }
}
