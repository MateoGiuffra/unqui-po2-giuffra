package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {

    private Multioperador mult; 
    private Integer n = 64;
    @BeforeEach
    public void setUp() throws Exception {
        mult = new Multioperador();
        mult.agregar(2);
        mult.agregar(2);
        mult.agregar(2);
        mult.agregar(2);
        mult.agregar(2);
        mult.agregar(2);
       
    }

    @Test
    public void testSumas() {
        n = 12;
        assertEquals(n, mult.sumarTodos());
    }
    @Test
    public void testRestas() {
    	n = -12;
    	assertEquals(n, mult.restarTodos());
    }
    @Test
    public void testMultiplos() {
    	n = 64;
    	assertEquals(n, mult.multiplicarTodos());
    }

}

