package ar.edu.unq.po2.tp6.PConcesionaria;

public class Cliente {
	private int cbu;
	private Retribucion retribucion;
	private PlanDeAhorro planAhorro;
	private String marca;
	private String modelo;
	
	public Cliente(int cbu, Retribucion retribucion, PlanDeAhorro planAhorro, String marca, String modelo) {
		super();
		this.cbu = cbu;
		this.retribucion = retribucion;
		this.planAhorro = planAhorro;
		this.marca = marca;
		this.modelo = modelo;
	}
	public void suscribirPlanAhorro(int cuotasAPagar) {
		PlanDeAhorro planAhorro = new PlanDeAhorro(this, this.getMarca(), this.getModelo(), cuotasAPagar, this.getCBU());
		this.planAhorro = planAhorro;
	}
	public void pagarCuota() {
		this.planAhorro.pagarCuota();
	}
	public Retribucion getRetribucion() {
		return this.retribucion;
	}
	public int getCBU() {
		return this.cbu;
	}
	public void setRetribucion(Retribucion retribucion) {
		this.retribucion = retribucion;
	}
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	public int getCuotasPagadas() {
		return planAhorro.getCuotasPagadas();
	}
	public int getCuotasPendientes() {
		return planAhorro.getCuotasPendientes();
	}
	
}
