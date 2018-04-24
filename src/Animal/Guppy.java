/*
 * ArkavQuarium
 * 
 */
package Animal;

import Coin.Coin;
import Food.Food;

/**
 *
 * @author regipurba
 */
public class Guppy extends Fish {

    public static final int growTo2 = 3;
    public static final int growTo3 = 10;
    public static final int SILVER = 55;
    public static final int GOLD = 60;
    private int growLevel;
    private int nbFood;
    private double coinTime;
    public final double intervalGenerateCoin;

    /**
     * This constructs guppy.
     */
    public Guppy() {
        super(0);
        nbFood = 0;
        growLevel = 1;
        coinTime = 0;
        intervalGenerateCoin = 22000;
    }

    /**
     * This method sets coin time of guppy.
     * @param coinTime coin time.
     */
    public void setCoinTime(double coinTime) {
        this.coinTime = coinTime;
    }

    /**
     * This returns nbFood.
     * @return nbFood.
     */
    public int getNbFood() {
        return nbFood;
    }

    /**
     * This method sets nbFood.
     * @param nbFood nbFood.
     */
    public void setNbFood(int nbFood) {
        this.nbFood = nbFood;
    }

    /**
     * This method sets guppy's grow level with given parameter.
     * @param growLevel growLevel.
     */
    public void setGrowLevel(int growLevel) {
        this.growLevel = growLevel;
    }

    /**
     * This returns guppy's grow level.
     * @return growLevel.
     */
    public int getGrowLevel() {
        return growLevel;
    }

    /**
     * This returns coin with specified condition.
     * @return coin.
     */
    @Override
    public Coin generateCoin() {
        Coin coin = null;
        switch (growLevel) {
            case 2: //Level 2
                coin = new Coin(SILVER, getX(), getY());
                break;
            case 3: //Level 3
                coin = new Coin(GOLD, getX(), getY());
        }
        return coin;
    }

    /**
     * This method gets Food's attribute for generate coin.
     * @param food food.
     */
    public void Eat(Food food) {
        if (!food.getIsReachBottom()) {
            nbFood++;
            if (nbFood == growTo2) {
                growLevel++;
            } else if (nbFood == growTo3) {
                growLevel++;
            }
            setIsFull(true);
            setDirectionTo(-1);
            setHungerTime(Fish.INTERVAL_TO_FULL);
        }
    }

    /**
     * This method prints current guppy.
     * @param s pics path.
     */
    @Override
    public void printFish(String[] s) {
    }
}
