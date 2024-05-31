package ar.edu.unq.po2.tpComposite;

public class PorcionTrigo implements Porcion {

	@Override
	public double gananciaAnual() {
		// TODO Auto-generated method stub
		return 300;
	}
	
}
//Ejercicio 2 - Cultivos
//Diseñe una solución para el siguiente problema.
//Se debe modelar un sistema que controla el uso que se le da a porciones productivas de
//tierra. Las porciones pueden ser puras de un cultivo o mixtas, estas ultimas se dividen
//en cuatro regiones iguales. En cada región se pueden plantar solamente soja, trigo o
//subdividir la porción en cuatro siguiendo las mismas reglas anteriores. La figura
//muestra un ejemplo de esto. A partir del cultivo, el sistema debe determinar las
//ganancias anuales de cada tipo de cultivo para una región. La región cultivada con soja
//da una ganancia anual de $500, la de trigo $300. En caso que la región este subdividida,
//la ganancia
//proporcional a la cantidad de sub parcelas que posean ese cultivo. El
//sistema debe responder a la ganancia anual que
//
//la parcela tanto para soja como
//para trigo.