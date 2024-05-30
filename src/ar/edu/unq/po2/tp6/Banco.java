package ar.edu.unq.po2.tp6;

import java.util.List;

public class Banco {
	List<Cliente> clientes;
	List<SolicitudCrediticia> solicitudes;
	
	public Banco(List<Cliente> clientes, List<SolicitudCrediticia> solicitudes) {
		super();
		this.clientes = clientes;
		this.solicitudes = solicitudes;
	}
	
	public void agregarCliente(Cliente c){
		clientes.add(c);
	}

	public void solicitarCredito(double cantidad, SolicitudCrediticia solicitud) {
		this.agregarSolicitud(solicitud);
		solicitud.prestamoParaCliente();
	}

	public void agregarSolicitud(SolicitudCrediticia solicitud) {
		solicitudes.add(solicitud);
	}
	
	public double montoTotalADesembolsar() {
		return this.solicitudes.stream().mapToDouble(s -> this.montoTotalDePrestamo(s)).sum(); 
	}

    private double montoTotalDePrestamo(SolicitudCrediticia s) {
    	return s.puedeSolicitarCredito() ? s.getMontoSolicitado() : 0;
    }
}
