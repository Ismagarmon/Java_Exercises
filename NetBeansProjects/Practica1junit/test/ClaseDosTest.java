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
public class ClaseDosTest {
    
    public ClaseDosTest() {
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
     * Test of esCierto method, of class ClaseDos.
     */
    @Test
    public void testEsCierto() {
        System.out.println("esCierto");
        ClaseDos instance = new ClaseDos();
        boolean expResult = true;
        boolean result = instance.esCierto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esFalso method, of class ClaseDos.
     */
    @Test
    public void testEsFalso() {
        System.out.println("esFalso");
        ClaseDos instance = new ClaseDos();
        boolean expResult = false;
        boolean result = instance.esFalso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
