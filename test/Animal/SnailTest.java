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
public class SnailTest {
    
    public SnailTest() {
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
     * Test of insertCoin method, of class Snail.
     */
    @Test
    public void testInsertCoin() {
        System.out.println("insertCoin() test");
        Coin c = new Coin(100,50,90);
        Snail instance = new Snail(640,480);
        instance.insertCoin(c);
    }

    /**
     * Test of Move method, of class Snail.
     */
    @Test
    public void testMove() {
        System.out.println("Move() test");
        double degree = 0.0;
        double deltaTime = 0.0;
        Snail instance = new Snail(640,480);
        instance.Move(degree, deltaTime);
    }

    /**
     * Test of setX method, of class Snail.
     */
    @Test
    public void testSetX() {
        System.out.println("setX() test");
        int x = 0;
        Snail instance = new Snail(640,480);
        instance.setX(x);
    }

    /**
     * Test of setY method, of class Snail.
     */
    @Test
    public void testSetY() {
        System.out.println("setY() test");
        int y = 0;
        Snail instance = new Snail(640,480);
        instance.setY(y);
    }

    /**
     * Test of getX method, of class Snail.
     */
    @Test
    public void testGetX() {
        System.out.println("getX() test");
        Snail instance = new Snail(640,480);
        int expResult = 0;
        int result = instance.getX();
        //tidak bisa ditest karena x random
//        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Snail.
     */
    @Test
    public void testGetY() {
        System.out.println("getY() test");
        Snail instance = new Snail(640,480);
        int expResult = 480-40;
        int result = instance.getY();
        //tidak bisa ditest karena y random
//        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountCoin method, of class Snail.
     */
    @Test
    public void testSetAmountCoin() {
        System.out.println("setAmountCoin() here");
        long amountCoin = 0L;
        Snail instance = new Snail(640,480);
        instance.setAmountCoin(amountCoin);
    }

    /**
     * Test of getAmountCoin method, of class Snail.
     */
    @Test
    public void testGetAmountCoin() {
        System.out.println("getAmountCoin() test");
        Snail instance = new Snail(640,480);
        long expResult = 0L;
        long result = instance.getAmountCoin();
        assertEquals(expResult, result);
    }

    /**
     * Test of findNearestCoin method, of class Snail.
     */
    @Test
    public void testFindNearestCoin() {
        System.out.println("findNearestCoin");
        LinkedList<Coin> coins = new LinkedList<>(new Node<>(new Coin(50, 4,5)));
        double deltaTime = 0.0;
        Snail instance = new Snail(640,480);
        instance.findNearestCoin(coins, deltaTime);
    }

    /**
     * Test of setStatePic method, of class Snail.
     */
    @Test
    public void testSetStatePic() {
        System.out.println("setStatePic() here");
        int state = 0;
        Snail instance = new Snail(640,480);
        instance.setStatePic(state);
    }

    /**
     * Test of getDirectionTo method, of class Snail.
     */
    @Test
    public void testGetDirectionTo() {
        System.out.println("getDirectionTo() here");
        Snail instance = new Snail(640,480);
        double expResult = -1.0;
        double result = instance.getDirectionTo();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDirectionTo method, of class Snail.
     */
    @Test
    public void testSetDirectionTo() {
        System.out.println("setDirectionTo() here");
        int directionTo = 0;
        Snail instance = new Snail(640,480);
        instance.setDirectionTo(directionTo);
    }

    /**
     * Test of printSnail method, of class Snail.
     */
    @Test
    public void testPrintSnail() {
        System.out.println("printSnail() here");
        String[] pics = {""};
        Snail instance = new Snail(640, 480);
        instance.printSnail(pics);
    }
    
}
