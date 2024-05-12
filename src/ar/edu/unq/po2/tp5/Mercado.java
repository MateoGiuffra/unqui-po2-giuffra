package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Mercado {
		
	ArrayList <Producto> stockDeProductos;
	
	public Mercado(ArrayList <Producto> stockDeProductos) {
		this.stockDeProductos = stockDeProductos;
	}
	
	public void agregarStock(Producto p) {
		stockDeProductos.add(p);
	}
	
	public void descrementaStockDe(Producto p) {
		stockDeProductos.remove(p);
	}

	public Integer cantidadDeStock() {
		// TODO Auto-generated method stub
		return stockDeProductos.size();
	}

}
