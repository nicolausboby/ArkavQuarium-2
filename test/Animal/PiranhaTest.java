/*
 * ArkavQuarium
 * 
 */
package Animal;

import Coin.Coin;
import LinkedList.LinkedList;
import LinkedList.Node;
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
public class PiranhaTest {
    
    public PiranhaTest() {
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
     * Test of assign method, of class Piranha.
     */
    @Test
    public void testAssign() {
        System.out.println("assign() test");
        Piranha piranha = new Piranha();
        Piranha instance = new Piranha();
        piranha.setEatAtLevel(2);
        instance.assign(piranha);
        assertEquals(2, instance.getEatAtLevel());
    }

    /**
     * Test of generateCoin method, of class Piranha.
     */
    @Test
    public void testGenerateCoin() {
        System.out.println("generateCoin() test");
        Piranha instance = new Piranha();
        instance.setEatAtLevel(2);
        Coin expResult = new Coin(300, 50, 50);
        Coin result = instance.generateCoin();
        assertEquals(expResult.getValue(), result.getValue());
    }

    /**
     * Test of findNearestFood method, of class Piranha.
     */
    @Test
    public void testFindNearestFood() {
        System.out.println("findNearestFood() test");
        LinkedList<Fish> fishes;
        fishes = new LinkedList<>(new Node<>(new Guppy()));
        double deltaTime = 0.0;
        Piranha instance = new Piranha();
        instance.setX(100);
        instance.setY(100);
        instance.findNearestFood(fishes, deltaTime);
    }

    /**
     * Test of Eat method, of class Piranha.
     */
    @Test
    public void testEat() {
        System.out.println("Eat() test");
        Guppy g = new Guppy();
        Piranha instance = new Piranha();
        instance.Eat(g);
    }

    /**
     * Test of getEatAtLevel method, of class Piranha.
     */
    @Test
    public void testGetEatAtLevel() {
        System.out.println("getEatAtLevel() test");
        Piranha instance = new Piranha();
        int expResult = -999;
        int result = instance.getEatAtLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEatAtLevel method, of class Piranha.
     */
    @Test
    public void testSetEatAtLevel() {
        System.out.println("setEatAtLevel() test");
        int eatAtLevel = 2;
        Piranha instance = new Piranha();
        instance.setEatAtLevel(eatAtLevel);
    }
    
}
