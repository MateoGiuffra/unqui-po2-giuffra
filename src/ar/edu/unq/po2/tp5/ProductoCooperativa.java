package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(double p){
		super(p);
	}
	
	@Override
	public double getPrecio() {
		return  0.9* this.precio;
	}
}
