package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> counter = new ArrayList<Integer>();
	
	public void addNumber(Integer num){
		counter.add(num);
	}
	
	
	public Integer cantPares(){
		
		Integer contador = 0;
		for (int i = 0; i < counter.size(); i++) {
			
		Integer numeroActual = counter.get(i); 
		if (numeroActual % 2 == 0)
				contador++;
		
		}		
		return contador;
	}
	
	/*
	 *	1. La cantidad de pares
		2. La cantidad de impares
		3. La cantidad de múltiplos de un cierto número.
 
	 */
	// List<Employee> employees = new ArrayList<Employee>();
	
}
