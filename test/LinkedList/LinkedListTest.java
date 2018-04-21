/*
 * ArkavQuarium
 * 
 */
package LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty() test");
        LinkedList<Integer> instance = new LinkedList<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add() test");
        LinkedList<Integer> instance = new LinkedList<>();
        instance.add(10);
    }

    /**
     * Test of remove method, of class LinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove() test");
        int idx = 0;
        LinkedList<Integer> instance = new LinkedList<>(new Node<Integer>(10));
        instance.remove(idx);
    }

    /**
     * Test of setHead method, of class LinkedList.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead() test");
        LinkedList<Integer> instance = new LinkedList<>();
        instance.setHead(new Node<Integer>(100));
    }

    /**
     * Test of getHead method, of class LinkedList.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead() test");
        LinkedList<Integer> instance = new LinkedList(new Node<Integer>(10));
        Node<Integer> expResult = new Node<>(10);
        Node<Integer> result = instance.getHead();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentSize method, of class LinkedList.
     */
    @Test
    public void testGetCurrentSize() {
        System.out.println("getCurrentSize() test");
        LinkedList<Integer> instance = new LinkedList<>();
        instance.add(9);
        instance.add(10);
        instance.add(9);
        instance.add(10);
        instance.remove(2);
        int expResult = 3;
        int result = instance.getCurrentSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrentSize method, of class LinkedList.
     */
    @Test
    public void testSetCurrentSize() {
        System.out.println("setCurrentSize() test");
        int currentSize = 2;
        LinkedList<Integer> instance = new LinkedList<>();
        instance.setCurrentSize(currentSize);
    }

    /**
     * Test of find method, of class LinkedList.
     */
    @Test
    public void testFind() {
        System.out.println("find() test");
        LinkedList<Integer> instance = new LinkedList<>();
        instance.add(60);
        instance.add(80);
        instance.add(90);
        int expResult = 1;
        int result = instance.find(new Node<Integer>(80));
        assertEquals(expResult, result);
    }

    /**
     * Test of getIndex method, of class LinkedList.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex() test");
        int idx = 2;
        LinkedList<Integer> instance = new LinkedList<>();
        instance.add(60);
        instance.add(80);
        instance.add(70);
        Node<Integer> expResult = new Node<>(70);
        Node<Integer> result = instance.getIndex(2);
        assertEquals(expResult, result);
    }   
}
