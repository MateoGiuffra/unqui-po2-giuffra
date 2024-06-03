package ar.edu.unq.po2.tp6.PConcesionaria;

public class PlanDeAhorro {
	
	private Cliente titular;
	private String marca;
	private String modelo;
	private int cantCuotasAPagar;
	private int cantCuotasPagadas = 0;
	private int cbuTitular;
	private Estado estado = new Creado();
	private Retribucion retribucion;
	
	
	public PlanDeAhorro(Cliente titular, String marca, String modelo, int cantCuotasAPagar, int cbuTitular) {
		super();
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.cantCuotasAPagar = cantCuotasAPagar;
		this.cbuTitular = cbuTitular;
	}
	
	public void pagarCuota() {
		estado.pagarCuota(this);
	}

	public int getCuotasPagadas() {
		// TODO Auto-generated method stub
		return this.cantCuotasAPagar;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Retribucion getRetribucion() {
		return retribucion;
	}

	public int getCuotasPendientes() {
		return this.cantCuotasPagadas;
	}
	public void ejecutarRetribucion() {
		estado.ejecutarRetribucion(this);
	}
	public void setRetribucion(Retribucion retribucion) {
		this.retribucion = retribucion;
	 } 

	public void registrarPago() {
		this.cantCuotasAPagar--;
		this.cantCuotasPagadas++;
	}

	public void setEstado(Estado estadoNuevo) {
		this.estado = estadoNuevo;
	}
}
