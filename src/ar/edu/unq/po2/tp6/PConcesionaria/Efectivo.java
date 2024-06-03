package ar.edu.unq.po2.tp6.PConcesionaria;

public class Efectivo extends Retribucion  {
	private RedBancaria red;
	private FabricaAutomotriz fabrica;
	@Override
	public void ejecutarRetribucion(Cliente cliente) {
		red.depositar(fabrica.valorAutomovil(cliente.getMarca(), cliente.getModelo()), cliente.getCBU());
	} 
	
	
}
