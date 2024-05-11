package ar.edu.unq.po2.tp3;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/


@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.addNumber(1);
counter.addNumber(3);
counter.addNumber(5);
counter.addNumber(7);
counter.addNumber(9);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(444);
}

@Test
public void testNumerosPares() {

int amount = counter.cantPares();

 assertEquals(amount, 1);
 

}

@Test
public void testNumerosImpares() {
	int amount = counter.cantImpares();
	assertEquals(amount,9);
}

@Test
public void testMultiplos() {
	int amount = counter.cantMultiplosDe(2);
	assertEquals(1, amount);
}


@Test
public void testNumeroConMasPares() {

	List<Integer> lista = new ArrayList<Integer>(); 
	lista.add(0);
	lista.add(10);
	lista.add(22);
	lista.add(6);
	lista.add(54432);
	assertEquals(54432, counter.numConMasPares(lista));
	
}



}

