/*
 * ArkavQuarium
 * 
 */
package Coin;

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
public class CoinTest {
    
    public CoinTest() {
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
     * Test of getValue method, of class Coin.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue() test");
        Coin instance = new Coin(100,50,40);
        long expResult = 100L;
        long result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Coin.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue() test");
        long v = 10L;
        Coin instance = new Coin();
        instance.setValue(v);
    }

    /**
     * Test of getStatePic method, of class Coin.
     */
    @Test
    public void testGetStatePic() {
        System.out.println("getStatePic() test");
        Coin instance = new Coin();
        int expResult = 0;
        int result = instance.getStatePic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatePic method, of class Coin.
     */
    @Test
    public void testSetStatePic() {
        System.out.println("setStatePic() test");
        int sp = 0;
        Coin instance = new Coin();
        instance.setStatePic(sp);
    }

    /**
     * Test of getX method, of class Coin.
     */
    @Test
    public void testGetX() {
        System.out.println("getX() test");
        Coin instance = new Coin(10,50,40);
        int expResult = 50;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Coin.
     */
    @Test
    public void testSetX() {
        System.out.println("setX() test");
        int x = 10;
        Coin instance = new Coin();
        instance.setX(x);
    }

    /**
     * Test of getY method, of class Coin.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Coin instance = new Coin(100,4,50);
        int expResult = 50;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Coin.
     */
    @Test
    public void testSetY() {
        System.out.println("setY() test");
        int y = 10;
        Coin instance = new Coin();
        instance.setY(y);
    }

    /**
     * Test of printCoin method, of class Coin.
     */
    @Test
    public void testPrintCoin() {
        System.out.println("printCoin() test");
        String[] coins = {""};
        Coin instance = new Coin();
        instance.printCoin(coins);
    }

    /**
     * Test of Move method, of class Coin.
     */
    @Test
    public void testMove() {
        System.out.println("Move() test");
        double deltatime = 2.0;
        Coin instance = new Coin();
        instance.Move(deltatime);
    }
    
}
