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
     */
    public Aquarium() {
        /**
         * LinkedList of Fish, Coin, and etc
         * Insert some fish, coin, food here!
         * sudahkah engkau menerima
        */
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
