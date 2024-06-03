package ar.edu.unq.po2.tp6.PConcesionaria;

public class Creado extends Estado {
	
	@Override
	public void pagarCuota(PlanDeAhorro planDeAhorro) {
		planDeAhorro.registrarPago();
		planDeAhorro.setEstado(new Vigente());
	}
	@Override
	public void setRetribucion(PlanDeAhorro planDeAhorro, Cliente cliente) {
		planDeAhorro.setRetribucion(cliente.getRetribucion()); 
	}

	
	
}
