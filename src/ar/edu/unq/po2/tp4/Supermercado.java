package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

//Un supermercado maneja el catálogo de los productos que vende. De cada producto se conoce su nombre, precio, y si el mismo es parte del
//programa Precios Cuidados o no. Por defecto, el producto no es parte del programa, a menos que se especifique lo contrario.
//Para ayudar a los clientes, el supermercado quiere realizar descuentos en productos de primer necesidad. Es por eso que al calcular el precio
//de un producto de “Primera Necesidad”, se aplica un descuento del 10%. Es decir:
//precioProductoPrimeraNecesidad = precioBaseDelProducto * 0.9
//El supermercado, del cual se conoce el nombre y la dirección, desea conocer la cantidad total de productos que comercializa y la suma total de
//los precios de los mismos.



public class Supermercado {
	String nombre; 
	String direccion; 
	ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion, ArrayList<Producto> productos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	int cantDeProductos() {
		return productos.size();
	}
	double sumaDePrecios(){
		return productos.stream().mapToDouble(producto -> producto.precio()).sum();
	}
	
	void agregarProducto(Producto p) {
		this.productos.add(p);
	}
//	double precioFinal(Producto producto) {
//		// Devuelve el precio final de un producto dependiendo de si es precioCuidado o no. 
//		 if (producto.esPrecioCuidado()) {
//			 return producto.precio() * 0.9;
//		} else {
//			 return producto.precio();
//		}
//	} antes estaba bien, ahora es responsabilidad del producto decir el precio final ya que el conoce su porcentaje. 
	


}
