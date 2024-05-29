package ar.edu.unq.po2.tp6;

public class Cliente {
	
	double sueldoNetoMensual;
	int edad;
	String nombre;
	String apellido;
	
	public Cliente(double sueldoMensual, int edad, String nombre, String apellido) {
		super();
		this.sueldoNetoMensual = sueldoMensual;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12; 
	}
	public void solicitarCredito(double cantidad, Banco banco, SolicitudCrediticia solicitud) {
		banco.solicitarCredito(cantidad, solicitud);
	}
	
	public void darPrestamo(double d) {
	
	}
	public double getMontoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	public int getEdad() {
		return this.edad;
	}
}
