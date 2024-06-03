package ar.edu.unq.po2.tp6.PConcesionaria;

public class Finalizado extends Estado {

	@Override
	public void pagarCuota(PlanDeAhorro planDeAhorro) {}
	@Override 
	public void ejecutarRetribucion(PlanDeAhorro planDeAhorro) {
		planDeAhorro.getRetribucion().ejecutarRetribucion(planDeAhorro.getTitular());
		planDeAhorro.setEstado(new Cerrado());
	}
	
}
