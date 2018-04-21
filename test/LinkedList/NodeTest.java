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
public class NodeTest {
    
    public NodeTest() {
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
     * Test of getNext method, of class Node.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext() test");
        Node<Integer> node = new Node<>(10);
        Node<Integer> nextNode = new Node<>(8);
        node.setNext(nextNode);
        Node<Integer> result = node.getNext();
        assertEquals(nextNode, result);
    }

    /**
     * Test of setNext method, of class Node.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext() test");
        Node<Integer> instance = new Node<>(9);
        instance.setNext(instance);
    }

    /**
     * Test of getPrev method, of class Node.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev() test");
        Node<Integer> instance = new Node<>(10);
        instance.setPrev(new Node<>(10));
        Node<Integer> expResult = new Node<>(10);
        Node<Integer> result = instance.getPrev();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrev method, of class Node.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev() test");
        Node<Integer> instance = new Node<>(10);
        instance.setPrev(new Node<>(15));
    }

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue() test");
        Node<Integer> instance = new Node<>(10);
        Integer expResult = 10;
        Integer result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Node.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue() test");
        Integer Value = 10;
        Node<Integer> instance = new Node<>(5);
        instance.setValue(Value);
    }

    /**
     * Test of assign method, of class Node.
     */
    @Test
    public void testAssign() {
        System.out.println("assign() test");
        Node<Integer> instance = new Node<>(5);
        instance.assign(new Node<>(8));
    }
}
