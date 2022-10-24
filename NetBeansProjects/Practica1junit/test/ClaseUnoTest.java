/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ismag
 */
public class ClaseUnoTest {
    
    public ClaseUnoTest() {
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
     * Test of sumar method, of class ClaseUno.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 9;
        int b = 9;
        ClaseUno instance = new ClaseUno();
        int expResult = 18;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class ClaseUno.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 9;
        int b = 4;
        ClaseUno instance = new ClaseUno();
        int expResult = 5;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
