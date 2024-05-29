package ar.edu.unq.po2.tp6;

public abstract class SolicitudCrediticia {
	
	private Cliente cliente;
	private double montoSolicitado;
	private int plazoEnMeses;
	
	public SolicitudCrediticia(Cliente cliente, double montoSolicitado, int plazoEnMeses) {
		super();
		this.cliente =cliente; 
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses; 
	}


	protected void prestamoParaCliente() {
		if (this.puedeSolicitarCredito()) {
			this.cliente.darPrestamo(this.montoPorMesPrestamo());
		}
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}
	protected double montoPorMesPrestamo() {
		return montoSolicitado / plazoEnMeses;
	}
	
	public int getPlazoEnMeses() {
		return this.plazoEnMeses;
	}
	
	protected abstract boolean puedeSolicitarCredito();
	
}


