package ar.edu.unq.po2.tp6;

public class SolicitudCrediticiaPersonal extends SolicitudCrediticia{
	
	public SolicitudCrediticiaPersonal(Cliente cliente, double montoSolicitado, int plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
	}
	
	@Override
	public boolean puedeSolicitarCredito() {						//chequeo si
		return this.getCliente().getSueldoNetoAnual() >= 15000 && // ingreso anual es al menos mayor a $15000
				0.70 * this.getCliente().getMontoNetoMensual()  > this.montoPorMesPrestamo(); //el monto de la cuota no supere el 70% de sus ingresos mensuales. 
	}
}
