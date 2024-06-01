package ar.edu.unq.po2.tpComposite.Juego;

public abstract class Caminante {
	Coordenada coordenadaActual;
	Tablero tablero;
	public abstract void caminar(Coordenada coordenada);
	
	public Coordenada getcoordenadaActual() {
		return this.coordenadaActual;
	}
	
	public void setcoordenadaActual(Coordenada coordenada) {
		this.coordenadaActual = coordenada;
	}
	
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	public Tablero getTablero(Tablero tablero) {
		return this.tablero;
	}
}
