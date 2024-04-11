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
			if (counter.get(i) % 2 == 0)
				contador++;
		}
		return contador;
	}

	public Integer cantInpares() {

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



}
