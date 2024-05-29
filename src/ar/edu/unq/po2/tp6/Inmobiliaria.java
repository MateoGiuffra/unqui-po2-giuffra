package ar.edu.unq.po2.tp6;

public class Inmobiliaria {
	String descripcion;
	String direccion;
	Double valorFiscal;
	
	public Inmobiliaria(String dir, String desc, Double valorF) {
		super();
		this.descripcion = desc;
		this.direccion   = dir;
		this.valorFiscal = valorF;
	}

	public double getValorFiscal() {
		// TODO Auto-generated method stub
		return this.valorFiscal;
	}
}
