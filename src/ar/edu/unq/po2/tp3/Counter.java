package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> counter = new ArrayList<Integer>();

	public void addNumber(Integer num) {
		counter.add(num);
	}

	public Integer cantPares() {

		Integer contador = 0;
		for (int i = 0; i < counter.size(); i++) {
			if (esPar(counter.get(i)))
				contador++;
		}
		return contador;
	}

	public Integer cantImpares() {

		Integer contador = 0;
		for (int i = 0; i < counter.size(); i++) {
			if (counter.get(i) % 2 != 0)
				contador++;
		}
		return contador;
	}

	public Integer cantMultiplosDe(Integer numero) {
		Integer contador = 0;
		for (int i = 0; i < counter.size(); i++) {
			if ((counter.get(i)) % numero == 0)
				contador++;

		}

		return contador;
	}
	
	public Integer numConMasPares(List<Integer> listaNumerica) {
		Integer nroFinal = 0;
		for (Integer nro : listaNumerica ) {
			nroFinal = numeroConMasPares (nroFinal, nro);
		}
		return nroFinal;
	}
	
		// PROPOSITO: Dado un numero, te devuelve la cantidad de pares que posee.
	private Integer cantParesDe (Integer n) {
	       
			Integer cantDePares = 0;
	        Integer variable = n; 
	        
	        while (variable > 0) {
	            if ((variable % 2) == 0) {
	                cantDePares++;
	            }
	            variable = variable / 10;
	            
	        }
	        
	        return cantDePares;
	    }
	
	private Integer numeroConMasPares(int n, int m) {
		
		
		Integer x = cantParesDe (n);
		Integer y = cantParesDe (m);
		
		if (x > y){
			return n;
		} else {
			return m;
		}	
	}
	
	
	private boolean esPar(Integer numero) {
		// PROPOSITO: Indica si un numero es par.
		return numero % 2 == 0;
	}
	
}
