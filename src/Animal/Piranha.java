/*
 * ArkavQuarium
 * 
 */
package Animal;

import Coin.Coin;
import LinkedList.Node;
import LinkedList.LinkedList;
import Printable.Printable;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author regipurba
 * @author Uslaconi
 */
public class Piranha extends Fish implements Printable{
    private int eatAtLevel; 
    public static final int PRC_GUPPY = 100;
    private String img;
    
    /**
     * This construct piranha object with no parameter.
     */
    public Piranha(){
        super(1);
        eatAtLevel = -999;
    }

    /**
     * This method assigns given parameter to current object.
     * @param piranha Piranha instance.
     */
    public void assign(Piranha piranha){
        eatAtLevel = piranha.eatAtLevel;
    }

    /**
     * This method generates coin with condition.
     * @return Coin object.
     */
    @Override
    public Coin generateCoin() {
        Coin coin = new Coin(PRC_GUPPY * (eatAtLevel + 1), super.getX(),super.getY());
        eatAtLevel = -999;
        return coin;
    }

    /**
     * This method finds nearest fish (guppy) from its location.
     * @param fishes LinkedList of Fish.
     * @param deltaTime delta time.
     */
    public void findNearestFood(LinkedList<Fish> fishes, double deltaTime) {
        Node<Fish> node = fishes.getHead();
        int j = 0;
        while (node.getValue().getID() != 0){
            node = node.getNext();
            j++;
        }
        
        double tempMin = Math.sqrt(Math.pow(super.getX() - node.getValue().getX(),2) + Math.pow(super.getY() - node.getValue().getY(),2));
        Node<Fish> minNode = node;

        if (tempMin <= 40) { //Makanan tepat di posisi piranha
            Guppy guppy = (Guppy) minNode.getValue();
            Eat(guppy);
            fishes.remove(j);
        } else {
            int i = j + 1;
            while (i < fishes.getCurrentSize() && node.getValue().getID() != 0){
                node = node.getNext();
                double temp = Math.sqrt(Math.pow(super.getX() - node.getValue().getX(),2) + Math.pow(super.getY() - node.getValue().getY(),2));
                if (tempMin > temp) {
                    tempMin = temp;
                    minNode = node;
                }
                i++;
            }

            //Bergerak ke arah makanan terdekat
            double deltaY = super.getY() - minNode.getValue().getY();
            double deltaX = super.getX() - minNode.getValue().getX();

            Move(Math.atan(deltaY / deltaX) * (180 / Math.PI), deltaTime * 1.5);
        }
    }

    /**
     * This method get guppy's growlevel to generate coin.
     * @param g Guppy instance.
     */
    public void Eat(Guppy g) {
        eatAtLevel = g.getGrowLevel();
        setIsFull(true);
        setDirectionTo(-1);
        setHungerTime(Fish.INTERVAL_TO_FULL);
    }

    /**
     * This returns eatAtLevel.
     * @return eatAtLevel.
     */
    public int getEatAtLevel(){
        return eatAtLevel;
    }

    /**
     * This method sets eatAtLevel of piranha.
     * @param eatAtLevel eatAtLevel of piranha.
     */
    public void setEatAtLevel(int eatAtLevel) {
        this.eatAtLevel = eatAtLevel;
    }
    
    /**
     * This method prints current guppy.
     * @param img
     * @return JLabel
     * @throws java.net.MalformedURLException
     */
    @Override
    public JLabel print(String img) throws MalformedURLException {
        URL url = new URL(img);
        ImageIcon icon = new ImageIcon(url);
        return new JLabel(icon);
    }
}
