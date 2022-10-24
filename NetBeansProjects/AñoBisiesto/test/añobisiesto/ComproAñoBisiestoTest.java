/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package añobisiesto;

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
public class ComproAñoBisiestoTest {
    
    public ComproAñoBisiestoTest() {
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
     * Test of AñoBisiesto method, of class ComproAñoBisiesto.
     */
    @Test
    public void testAñoBisiesto() {
        System.out.println("A\u00f1oBisiesto");
        int año = 2100;
        boolean expResult = false;
        boolean result = ComproAñoBisiesto.AñoBisiesto(año);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
