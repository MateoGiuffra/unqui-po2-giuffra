package ar.edu.unq.po2.tpObserver.EncuentrosDeportivos;

import java.util.List;

public interface Suscriptor {
	
	public void updatePartido(Partido partido);
	public void updateContrincante(List<String> contrincantes);
	public boolean estaInteresadoEnElPartido(Partido partido);
	public boolean estaInteresadoEnContricantes(List<String> contrincantes);
}
