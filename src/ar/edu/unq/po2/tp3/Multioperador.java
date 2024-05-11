package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> multi = new ArrayList <Integer>(); 
	
	public void agregar(Integer x) {
		multi.add(x);
	}
	
	public Integer sumarTodos() {

		Integer resultado = 0;
		for (int i = 0; multi.size() > i ; i++) {
			 resultado += multi.get(i);
		}
		return resultado; 
	}
	
	public Integer restarTodos() {

		Integer resultado = 0;
		for (int i = 0; multi.size() > i ; i++) {
			 resultado -= multi.get(i);
		}
		return resultado; 
	}
	
	public Integer multiplicarTodos() {

		Integer resultado = 1;
		for (int i = 0; multi.size() > i ; i++) {
			 resultado *= multi.get(i);
		}
		return resultado; 
	}
}
