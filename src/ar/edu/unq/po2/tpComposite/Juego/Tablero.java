package ar.edu.unq.po2.tpComposite.Juego;

import java.util.List;

public class Tablero {
	
	private List<Coordenada> listaDeCoordenadas;

	public Tablero(List<Coordenada> listaDeCoordenadas) {
		super();
		this.listaDeCoordenadas = listaDeCoordenadas;
	}

	public List<Coordenada> getListaDeCoordenadas() {
		return this.listaDeCoordenadas;
	}

	public void setListaDeCoordenadas(List<Coordenada> listaDeCoordenadas) {
		this.listaDeCoordenadas = listaDeCoordenadas;
	}
	
	
	
}