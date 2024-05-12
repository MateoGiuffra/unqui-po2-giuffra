package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
//El Impuesto al Trabajador es un impuesto que pagan anualmente todos los trabajadores del país. El monto a pagar del impuesto es un 2% del
//total del monto imponible de los ingresos del trabajador.
//De cada trabajador se registran sus ingresos percibidos del año. De cada ingreso se conoce el mes de percepción, el concepto y el monto
//percibido. Existe un tipo de ingreso, el Ingreso por Horas Extras, del cual se conoce además la cantidad de horas extras realizadas, por las
//cuales el trabajados percibió tal ingreso.
//Para un ingreso, el monto imponible al Impuesto al Trabajador es igual al monto percibido. Sin embargo, los ingresos por horas extras están
//exentos al impuesto. Es decir, suman cero al total del monto imponible al impuesto al trabajador.
//La solución debe respetar el siguiente protocolo:
//Trabajador>>getTotalPercibido()
////retornar el monto total percibido por el trabajador
//Obra publicada con Licencia Creative Commons Reconocimiento Compartir igual 4.0
//Trabajador>>getMontoImponible()
////retornar el monto imponible al impuesto al trabajador
//Trabajador>>getImpuestoAPagar()
////retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible

public class Trabajador {
	
	ArrayList <Ingreso> ingresos;
	ImpuestoTrabajador impuesto; 
	
	public Trabajador(ArrayList <Ingreso> ingresos) {
		super();
		this.ingresos = ingresos;
	}
	

	public void recibirNuevoIngreso(Ingreso i) {
		ingresos.add(i);
	}
	
	public double getTotalPercibido() {
		//retornar el monto total percibido por el trabajador
		return ingresos.stream().mapToDouble(ingreso -> ingreso.getMonto()).sum();
	}
	
	public double getImpuestoAPagar() {
		//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
		return ingresos.stream().mapToDouble(ingreso -> ingreso.montoImpuestoAlTrabajador()).sum();
	}
	public double getMontoImponible() {
		//retornar el monto imponible al impuesto al trabajador
		return this.getTotalPercibido() - this.getImpuestoAPagar();
	}
	
}
