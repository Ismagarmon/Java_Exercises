/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
public class ComproCalculadoraTest {
    
    public ComproCalculadoraTest() {
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
     * Test of Sumar method, of class ComproCalculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int a = 4;
        int b = 4;
        int expResult = 8;
        int result = ComproCalculadora.Sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class ComproCalculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int a = 4;
        int b = 2;
        int expResult = 2;
        int result = ComproCalculadora.Restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multipicacion method, of class ComproCalculadora.
     */
    @Test
    public void testMultipicacion() {
        System.out.println("Multipicacion");
        int a = 2;
        int b = 2;
        float expResult = 4.0F;
        float result = ComproCalculadora.Multipicacion(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class ComproCalculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int a = 2;
        int b = 2;
        float expResult = 1.0F;
        float result = ComproCalculadora.Division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
