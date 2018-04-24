/*
 * ArkavQuarium
 * 
 */
package Location;

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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getX method, of class Location.
     */
    @Test
    public void testGetX() {
        System.out.println("getX() test");
        Location instance = new Location();
        instance.setX(10);
        int expResult = 10;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Location.
     */
    @Test
    public void testGetY() {
        System.out.println("getY() test");
        Location instance = new Location();
        instance.setY(70);
        int expResult = 70;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Location.
     */
    @Test
    public void testSetX() {
        System.out.println("setX() test");
        int x = 0;
        Location instance = new Location();
        instance.setX(x);
    }

    /**
     * Test of setY method, of class Location.
     */
    @Test
    public void testSetY() {
        System.out.println("setY() test");
        int y = 0;
        Location instance = new Location();
        instance.setY(y);
    }
    
}
