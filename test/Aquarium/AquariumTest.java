/*
 * ArkavQuarium
 * 
 */
package Aquarium;

import Animal.Fish;
import Animal.Snail;
import Coin.Coin;
import Food.Food;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author regipurba
 */
public class AquariumTest {
    
    public AquariumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSnail method, of class Aquarium.
     */
    @Test
    public void testGetSnail() {
        System.out.println("getSnail");
        Aquarium instance = new Aquarium(5,6);
        Snail expResult = new Snail(5,6);
        Snail result = instance.getSnail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFishes method, of class Aquarium.
     */
    @Test
    public void testGetFishes() {
        System.out.println("getFishes");
        Aquarium instance = new Aquarium(640,480);
        LinkedList<Fish> expResult = new LinkedList<>();
        LinkedList<Fish> result = instance.getFishes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoins method, of class Aquarium.
     */
    @Test
    public void testGetCoins() {
        System.out.println("getCoins");
        Aquarium instance = null;
        LinkedList<Coin> expResult = null;
        LinkedList<Coin> result = instance.getCoins();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFood method, of class Aquarium.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        Aquarium instance = null;
        LinkedList<Food> expResult = null;
        LinkedList<Food> result = instance.getFood();
        assertEquals(expResult, result);
    }
    
}
