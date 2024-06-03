package ar.edu.unq.po2.tp6.PConcesionaria;

import java.util.List;
import java.util.stream.Stream;

public class Concesionaria {
	private List<Cliente> clientes;
	
	public int totalCuotasPendientes() {
		Stream<Cliente> clientesQueYaPagaron = this.clientes.stream().filter(c -> c.getCuotasPagadas() >= 1);
		return clientesQueYaPagaron.mapToInt(c -> c.getCuotasPendientes()).sum();
	}
}
