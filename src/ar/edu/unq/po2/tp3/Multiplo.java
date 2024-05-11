package ar.edu.unq.po2.tp3;

public class Multiplo {
	
	public int multiploMayor(int x, int y) {
		// PRECONDICION: El primer int tiene que ser mayor o igual al segundo. 
		int resultado = 1000;
		
		if (x % y != 0){
			resultado = -1;
		} else {
		   for (int i = 1000; i > 0; i--) {
		            if (i % x == 0 && i % y == 0) {
		            	resultado = i;
		                i = 0;
		            }
		        }
		}
		
		return resultado;
		
	}

	
}
