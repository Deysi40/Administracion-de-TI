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

        System.out.println("Suma");
        suma sum = new suma();
        assertEquals(2, sum.getSuma(5, 3));
    }
    
}
