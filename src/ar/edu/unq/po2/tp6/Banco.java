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
		solicitudes.add(solicitud);
		solicitud.prestamoParaCliente();
	}

	
}
