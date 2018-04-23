/*
 * ArkavQuarium
 * 
 */
package Aquarium;

import java.util.*;
import Animal.*;
import Coin.*;
import Food.*;

/**
 *
 * @author regipurba
 */
public class Aquarium {
    private LinkedList<Fish> Fishes;
    private LinkedList<Coin> Coins;
    private LinkedList<Food> Foods;
    private Snail snail;

    /**
     * This constructs Aquarium and create new Fish, Coin, and etc.
     * @param height Height of window.
     * @param width Width of window. 
     */
    public Aquarium(int height, int width) {
        /**
         * LinkedList of Fish, Coin, and etc
         * Insert some fish, coin, food here!
        */
        
        Fishes = new LinkedList<>();
        Coins = new LinkedList<>();
        Foods = new LinkedList<>();
        snail = new Snail(height, width);
        
        Guppy guppy = new Guppy();
        guppy.setX((int)(Math.random() * ((width - 40)+1)) + 40); //random X
	guppy.setY((int)(Math.random() * ((height - 115)+1)) + 115); //random Y
	Fishes.add(guppy);
        
        Guppy guppy2 = new Guppy();
        guppy.setX((int)(Math.random() * ((width - 40)+1)) + 40); //random X
	guppy.setY((int)(Math.random() * ((height - 115)+1)) + 115); //random Y
	Fishes.add(guppy2);
    }
    
    /**
     * This returns snail object.
     * @return Snail.
     */
    public Snail getSnail(){
        return snail;
    }
    
    /**
     * This returns LinkedList of Fish.
     * @return LinkedList of Fish.
     */
    public LinkedList<Fish> getFishes(){
        return Fishes;
    }
    
    /**
     * This returns LinkedList of Coins.
     * @return LinkedList of Coin.
     */
    public LinkedList<Coin> getCoins(){
        return Coins;
    }
    
    /**
     * This returns LinkedList of Food.
     * @return LinkedList of Food.
     */
    public LinkedList<Food> getFood(){
        return Foods;
    }
}
