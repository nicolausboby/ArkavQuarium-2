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
        Aquarium instance = null;
        Snail expResult = null;
        Snail result = instance.getSnail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFishes method, of class Aquarium.
     */
    @Test
    public void testGetFishes() {
        System.out.println("getFishes");
        Aquarium instance = null;
        LinkedList<Fish> expResult = null;
        LinkedList<Fish> result = instance.getFishes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
