package ar.edu.unq.po2.tp6.PConcesionaria;

public class Automovil extends Retribucion{
	private FabricaAutomotriz fabrica;

	@Override
	public void ejecutarRetribucion(Cliente cliente) {
		 fabrica.comprarAutomovil(cliente.getMarca(), cliente.getModelo());
	}


}
