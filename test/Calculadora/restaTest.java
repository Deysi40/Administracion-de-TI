/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
 
//import org.junit.Test;
//import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class restaTest {
    @Test
    public void testGetResta() {

        System.out.println("Resta");
        resta rest = new resta();
        assertEquals(2, rest.getResta(5, 3));
    }
    
}
