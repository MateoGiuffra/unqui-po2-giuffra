package ar.edu.unq.po2.tp6;

public class SolicitudCrediticiaHipotecaria extends SolicitudCrediticia{ 
	
	Inmobiliaria propiedadDeGarantia;
	
	public SolicitudCrediticiaHipotecaria(Cliente cliente, double montoSolicitado, int plazoEnMeses, Inmobiliaria propiedad) {
		super(cliente, montoSolicitado, plazoEnMeses);
		this.propiedadDeGarantia = propiedad;
	}
	
	@Override
	public boolean puedeSolicitarCredito() {
		return 0.50 * this.getCliente().getMontoNetoMensual() < this.montoPorMesPrestamo() && 
			   this.getMontoSolicitado() < 0.70 * propiedadDeGarantia.getValorFiscal() &&
			   this.clienteTieneEdadRequerida();
	}

	private boolean clienteTieneEdadRequerida() {
		int edadCliente = this.getCliente().getEdad();
		return (edadCliente <= 65 && (edadCliente == 65 ? this.getPlazoEnMeses() < 12 : true)) ;
				// chequea si es menor igual a 65, si no es directamente ni se fija si el cliente va a ser mayor a 65 cuando temrine de pagar el credito
	}
}
