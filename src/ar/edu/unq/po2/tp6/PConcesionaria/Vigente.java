package ar.edu.unq.po2.tp6.PConcesionaria;

public class Vigente extends Estado{
	
	
	@Override
	public void pagarCuota(PlanDeAhorro planDeAhorro) {
		
		if (planDeAhorro.getCuotasPendientes() == 1) {
			planDeAhorro.registrarPago();
			planDeAhorro.setEstado(new Finalizado());
		}else {
			planDeAhorro.registrarPago();		
		}
		
	}
	
	
	
	
	
}
