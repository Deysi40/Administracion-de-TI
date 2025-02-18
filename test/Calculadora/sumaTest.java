/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class sumaTest {
    
    public sumaTest() {
    }
    //DEYSI PRISCILA lOPEZ JIMÉNEZ
    @Test
    public void testGetSuma() {
        
        System.out.println("getSuma");
        suma calc = new suma();
        int result = calc.getSuma(5,3);
        int expected = 8;
        assertEquals(expected, result);
    }
    
}
