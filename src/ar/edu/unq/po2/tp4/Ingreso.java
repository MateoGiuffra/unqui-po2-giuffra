package ar.edu.unq.po2.tp4;


import java.time.Month;


public abstract class Ingreso {
	
	Month mesDePercepcion;
	String concepto;
	double montoPercibido; 
	
	public Ingreso(Month mesDePercepcion,String concepto,double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto        = concepto;
		this.montoPercibido  = montoPercibido;
		
	}
	
	public double getMonto() {
		return montoPercibido;
	}
	protected abstract double montoImpuestoAlTrabajador();

}
