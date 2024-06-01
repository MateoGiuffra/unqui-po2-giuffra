package ar.edu.unq.po2.tpComposite.Juego;

public class Caballero extends Caminante{

	@Override
	public void caminar(Coordenada coordenada) {
		this.setcoordenadaActual(coordenada);	

	}

	
//	Caballero:
//		o Al caminar debe ir vigilando la zona. Por lo tanto, para ir de un punto a
//		otro debe hacerlo en zigzag para controlar que no haya enemigos.
}
