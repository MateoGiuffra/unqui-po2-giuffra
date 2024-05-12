package ar.edu.unq.po2.tp4;

//Un supermercado maneja el catálogo de los productos que vende. De cada producto se conoce su nombre, precio, y si el mismo es parte del
//programa Precios Cuidados o no. Por defecto, el producto no es parte del programa, a menos que se especifique lo contrario.
//Para ayudar a los clientes, el supermercado quiere realizar descuentos en productos de primer necesidad. Es por eso que al calcular el precio
//de un producto de “Primera Necesidad”, se aplica un descuento del 10%. Es decir:
//precioProductoPrimeraNecesidad = precioBaseDelProducto * 0.9
//El supermercado, del cual se conoce el nombre y la dirección, desea conocer la cantidad total de productos que comercializa y la suma total de
//los precios de los mismos.


public class Producto {
	
	double precio;
	String nombre;
	boolean esPrecioCuidado;
	double porcentaje;
	
	public Producto(String name, double price, boolean carefulPrice, double porcentaje) {
		super();
		this.precio = price;
		this.nombre = name; 
		this.esPrecioCuidado = carefulPrice;
		this.porcentaje = porcentaje;
	}
	
	public double precio() {
		if (this.esPrecioCuidado()){
			return precioConDescuento();
		}
			return precio;
	}


	private double precioConDescuento() {
		// TODO Auto-generated method stub
		return  this.precio - this.precio * this.porcentaje / 100;
	}

	public boolean esPrecioCuidado() {
		// TODO Auto-generated method stub
		return esPrecioCuidado;
	}

}


