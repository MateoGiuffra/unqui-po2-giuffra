package ar.edu.unq.po2.tpObserver.EncuentrosDeportivos;

import java.util.List;


//Además, existen aplicaciones móviles que le permiten a una persona recibir los resultados de aquellos deportes o
//contrincantes que les interesa. Para ello, se suscriben a la información relacionada a un deporte y/o un contrincante


public class Cliente implements Suscriptor{
	
	
	private List<Partido> partidosInteresantes;
	private List<String> contrincantesInteresantes;
	private List<Partido> partidosAlTanto;
	private List<String> contrincantesAlTanto;
	
	@Override
	public void updatePartido(Partido partido) {
		this.partidosAlTanto.add(partido);
		
	}
	@Override
	public void updateContrincante(List<String> contrincantes){
		this.contrincantesAlTanto.addAll(contrincantes);
	}

	@Override
	public boolean estaInteresadoEnElPartido(Partido partido) {
		return this.partidosInteresantes.contains(partido);
	}
	
	@Override
	public boolean estaInteresadoEnContricantes(List<String> contrincantes) {
		// TODO Auto-generated method stub
		return this.contrincantesInteresantes.contains(contrincantes);
	}

}
