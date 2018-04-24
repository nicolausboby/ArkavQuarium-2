/*
 * ArkavQuarium
 * 
 */
package Food;

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
public class FoodTest {
    
    public FoodTest() {
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
     * Test of getStatePic method, of class Food.
     */
    @Test
    public void testGetStatePic() {
        System.out.println("getStatePic() test");
        Food instance = new Food();
        int expResult = 0;
        int result = instance.getStatePic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatePic method, of class Food.
     */
    @Test
    public void testSetStatePic() {
        System.out.println("setStatePic() test");
        int state = 0;
        Food instance = new Food();
        instance.setStatePic(state);
    }

    /**
     * Test of getX method, of class Food.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Food instance = new Food();
        instance.setX(10);
        int expResult = 10;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Food.
     */
    @Test
    public void testSetX() {
        System.out.println("setX() test");
        int x = 0;
        Food instance = new Food();
        instance.setX(x);
    }

    /**
     * Test of getY method, of class Food.
     */
    @Test
    public void testGetY() {
        System.out.println("getY() test");
        Food instance = new Food();
        instance.setY(10);
        int expResult = 10;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Food.
     */
    @Test
    public void testSetY() {
        System.out.println("setY() test");
        int y = 0;
        Food instance = new Food();
        instance.setY(y);
    }

    /**
     * Test of setIsReachBottom method, of class Food.
     */
    @Test
    public void testSetIsReachBottom() {
        System.out.println("setIsReachBottom() test");
        boolean reachBottom = false;
        Food instance = new Food();
        instance.setIsReachBottom(reachBottom);
    }

    /**
     * Test of getIsReachBottom method, of class Food.
     */
    @Test
    public void testGetIsReachBottom() {
        System.out.println("getIsReachBottom() test");
        Food instance = new Food();
        boolean expResult = false;
        boolean result = instance.getIsReachBottom();
        assertEquals(expResult, result);
    }
    
}
