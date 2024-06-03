package ar.edu.unq.po2.tp6.PConcesionaria;

public abstract class Estado {

	public abstract void pagarCuota(PlanDeAhorro planDeAhorro);
	public void setRetribucion(PlanDeAhorro planDeAhorro, Cliente cliente) {}
	public void ejecutarRetribucion(PlanDeAhorro planDeAhorro) {}

}
