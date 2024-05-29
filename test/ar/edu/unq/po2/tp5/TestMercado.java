package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMercado {

	// Instancias de variable: 
	Mercado coto;
	Producto leche;
	Producto carne;
	Producto pan;
	Caja caja;
	ArrayList<Producto> productos;
	
	@BeforeEach
	public void SetUp() {
		
		productos = new ArrayList<>();
		coto  = new Mercado(productos);
	
		pan   = new Producto(1000);
		carne = new ProductoCooperativa(6000);
		leche = new ProductoCooperativa(1200);
		
		coto.agregarStock(pan);
		coto.agregarStock(leche);
		coto.agregarStock(carne);
		
		caja = new Caja(0,coto);
	}
	
	
	@Test
	void testLaCantidadDelStockEsTres() {
		assertEquals(3,coto.cantidadDeStock());
	}
	
	
	@Test
	void testPrecioDeLaCarneEs5400() {
		caja.registrarProducto(carne);
		assertEquals(5400,caja.getMontoRecaudado());
	}
	
	@Test
	void testPrecioDeLaLecheEsElMismo() {
		caja.registrarProducto(leche);
		assertEquals(leche.getPrecio(),caja.getMontoRecaudado());
	}
	
	
	@Test
	void testRegistroDeTodosLosProductos() {
		
		caja.registrarProducto(pan);
		caja.registrarProducto(leche);
		caja.registrarProducto(carne);
		
		assertEquals(0,coto.cantidadDeStock());
		assertEquals(5400 + 1080 + 1000, caja.getMontoRecaudado());
	}

	

}
