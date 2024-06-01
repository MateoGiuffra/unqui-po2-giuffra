package ar.edu.unq.po2.tpComposite.Juego;

public class Coordenada {
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String imprimirCoordenada() {
		return " El valor de X es: " + this.x + " y el valor de Y es: " + this.y + ".";
	}
	
}
