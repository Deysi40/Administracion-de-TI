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
public class restaTest {
    
    public restaTest() {
    }

    @Test
    public void testGetResta() {
        System.out.println("getResta");
        resta calc = new resta();
        int result = calc.getResta(5,3);
        int expected = 2;
        assertEquals(expected, result);
    }
    
}
