/*
 * ArkavQuarium
 * 
 */
package Animal;

import Coin.Coin;
import LinkedList.LinkedList;
import LinkedList.Node;
import Location.Location;

/**
 *
 * @author regipurba
 */
public class Snail {
    private Location location;
    private double timeDirection;
    private double directionTo;
    private int statePic;
    private long amountCoin;
    
    /**
     * This constructs snail with s specified height and width.
     * @param height Height of window.
     * @param width Width of window.
     */
    public Snail(int height, int width){
        directionTo = -1;
        amountCoin = 0;
        statePic = 0;
        location.setX((int)(Math.random() * ((width - 40)+1)) + 40);
        location.setY((int)(Math.random() * ((height - 115)+1)) + 115);
    }

    /**
     * This method sets coin.
     * @param c Coin contains value.
     */
    public void insertCoin(Coin c){
        amountCoin += c.getValue();
    }
    
    /**
     * This method move snail with specified parameter (degree and deltaTime. 
     * @param degree Arctan of snail and nearest coin.
     * @param deltaTime Delta time.
     */
    public void Move(double degree, double deltaTime){}

    /**
     * This method sets x location.
     * @param x X-location.
     */
    public void setX(int x){location.setX(x);}

    /**
     * This method sets y location.
     * @param y Y-location.
     */
    public void setY(int y){location.setY(y);}

    /**
     * This returns x location
     * @return x location.
     */
    public int getX(){return location.getX();}

    /**
     * This returns y location.
     * @return y location.
     */
    public int getY(){return location.getY();}

    /**
     * This method sets amountCoin with given parameter.
     * @param amountCoin Amount Coin.
     */
    public void setAmountCoin(long amountCoin){
        this.amountCoin = amountCoin;
    }
    
    /**
     * This returns amount coin in Snail.
     * @return amountCoin
     */
    public long getAmountCoin(){
        return amountCoin;
    }
    
    /**
     * This method find nearest coin from snail.
     * @param coins List of coins.
     * @param deltaTime delta time.
     */
    public void findNearestCoin(LinkedList<Coin> coins, double deltaTime){
        Node<Coin> node = coins.getHead();
        
        double tempMin = Math.sqrt(Math.pow(location.getX() - node.getValue().getX(),2) + Math.pow(location.getY() - node.getValue().getY(),2));
        Node<Coin> minNode = node;

        if (tempMin <= 40) { //Makanan tepat di posisi piranha
            insertCoin(node.getValue());
            coins.remove(0);
        } else {
            int i = 1;
            while (i < coins.getCurrentSize()){
                node = node.getNext();
                double temp = Math.sqrt(Math.pow(location.getX() - node.getValue().getX(),2) + Math.pow(location.getY() - node.getValue().getY(),2));
                if (tempMin > temp) {
                    tempMin = temp;
                    minNode = node;
                }
                i++;
            }

            //Bergerak ke arah makanan terdekat
            double deltaY = location.getY() - minNode.getValue().getY();
            double deltaX = location.getX() - minNode.getValue().getX();

            Move(Math.atan(deltaY / deltaX) * (180 / Math.PI), deltaTime * 1.5);
        }
    }
    
    /**
     * This method sets state of pic.
     * @param state state of pic.
     */
    public void setStatePic(int state){statePic = state;}

    /**
     * This returns direction of snail.
     * @return directionTo
     */
    public double getDirectionTo(){return directionTo;}

    /**
     * This method sets directionTo with given parameter.
     * @param directionTo direction of snail.
     */
    public void setDirectionTo(int directionTo){this.directionTo = directionTo;}

    /**
     * This method print current snail.
     * @param pics pics path.
     */
    public void printSnail(String[] pics){
        if(this.directionTo < 270 && this.directionTo > 90){
            
        }
            
    }
}
