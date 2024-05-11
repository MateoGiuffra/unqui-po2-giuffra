package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSupermercadoProducto {

	Supermercado supermercado;
	Producto productoPrecioCuidado;
	Producto productoNoPrecioCuidado;
	ArrayList <Producto> productos; 

	
	@BeforeEach
	public void SetUp() {
		productoPrecioCuidado = new Producto("Leche",1200,true);
		productoNoPrecioCuidado = new Producto("Cindor",2000,false);
		supermercado = new Supermercado("Coto", "Av.Dardo Rocha y Cerrito", productos);
		productos = new ArrayList<Producto>();
		supermercado.agregarProducto(productoPrecioCuidado);
		supermercado.agregarProducto(productoNoPrecioCuidado);
		
	}
	@Test
	void testPrecioConDescuento() {
		assertEquals(1080,supermercado.precioFinal(productoPrecioCuidado));
	}
	@Test
	void testPrecioSinDescuento() {
		assertEquals(2000,supermercado.precioFinal(productoNoPrecioCuidado));
	}
	@Test
	void testSumaTotalDePrecios() {
		assertEquals(3080,supermercado.sumaDePrecios());
	}	
	@Test
	void testCantidadDeProductos(){
		assertEquals(2,supermercado.cantDeProductos());
	}
	
}
