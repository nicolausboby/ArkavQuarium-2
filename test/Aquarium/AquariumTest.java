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
        System.out.println("getSnail() test");
        Aquarium instance = new Aquarium(640,480);
//        Snail expResult = new Snail(640,480);
        Snail result = instance.getSnail();
        if (result == null && result.getX() != 640 && result.getY() != 480)
            fail("Fail test!");
    }

    /**
     * Test of getFishes method, of class Aquarium.
     */
    @Test
    public void testGetFishes() {
        System.out.println("getFishes() test");
        Aquarium instance = new Aquarium(640,480);
        LinkedList<Fish> expResult = new LinkedList<>();
        LinkedList<Fish> result = instance.getFishes();
        if (result == null)
            fail("Fail test!");
    }

    /**
     * Test of getCoins method, of class Aquarium.
     */
    @Test
    public void testGetCoins() {
        System.out.println("getCoins() test");
        Aquarium instance = new Aquarium(640,480);
        LinkedList<Coin> expResult = new LinkedList<>();
        LinkedList<Coin> result = instance.getCoins();
        if (result == null)
            fail("Fail test!");
    }

    /**
     * Test of getFood method, of class Aquarium.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood() test");
        Aquarium instance = new Aquarium(640,480);
        LinkedList<Food> expResult = new LinkedList<>();
        LinkedList<Food> result = instance.getFood();
         if (result == null)
            fail("Fail test!");
    }
    
}
