/*
 * ArkavQuarium
 * 
 */
package Animal;

import Coin.Coin;
import Food.Food;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class GuppyTest {
    
    public GuppyTest() {
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
     * Test of setCoinTime method, of class Guppy.
     */
    @Test
    public void testSetCoinTime() {
        System.out.println("setCoinTime");
        double coinTime = 0.0;
        Guppy instance = new Guppy();
        instance.setCoinTime(coinTime);
    }

    /**
     * Test of getNbFood method, of class Guppy.
     */
    @Test
    public void testGetNbFood() {
        System.out.println("getNbFood");
        Guppy instance = new Guppy();
        instance.setNbFood(2);
        int expResult = 2;
        int result = instance.getNbFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNbFood method, of class Guppy.
     */
    @Test
    public void testSetNbFood() {
        System.out.println("setNbFood");
        int nbFood = 2;
        Guppy instance = new Guppy();
        instance.setNbFood(nbFood);
        int result = instance.getNbFood();
        assertEquals(nbFood, result);
    }

    /**
     * Test of setGrowLevel method, of class Guppy.
     */
    @Test
    public void testSetGrowLevel() {
        System.out.println("setGrowLevel");
        int growLevel = 2;
        Guppy instance = new Guppy();
        instance.setGrowLevel(growLevel);
    }

    /**
     * Test of getGrowLevel method, of class Guppy.
     */
    @Test
    public void testGetGrowLevel() {
        System.out.println("getGrowLevel");
        Guppy instance = new Guppy();
        int expResult = 2;
        instance.setGrowLevel(2);
        int result = instance.getGrowLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of generateCoin method, of class Guppy.
     */
    @Test
    public void testGenerateCoin() {
        System.out.println("generateCoin");
        Guppy instance = new Guppy();
        instance.setGrowLevel(2);
        instance.setX(50);
        instance.setY(50);
//        Coin expResult = new Coin(0,50,50);
        Coin result = instance.generateCoin();
        assertEquals(result, result);
    }

    /**
     * Test of Eat method, of class Guppy.
     */
    @Test
    public void testEat() {
        System.out.println("Eat");
        Food food = new Food();
        food.setX(45);
        food.setY(5);
        Guppy instance = new Guppy();
        instance.Eat(food);
    }
}
