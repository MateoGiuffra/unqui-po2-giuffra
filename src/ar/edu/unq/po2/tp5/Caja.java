package ar.edu.unq.po2.tp5;

public class Caja {
	
	double montoRecaudado;
	Mercado mercado;
	
	public Caja(double monto,Mercado mercado) {
		super();
		this.montoRecaudado = monto;
		this.mercado = mercado;
	}
	
	public void registrarProducto(Producto p) {
		// Supongo que el producto que me dan existe en el mercado.
		this.montoRecaudado += p.getPrecio();
		mercado.descrementaStockDe(p);
	}
	
	
	
	public double getMontoRecaudado() {
		// TODO Auto-generated method stub
		return this.montoRecaudado;
	}
}
