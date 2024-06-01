package ar.edu.unq.po2.tpObserver.EncuentrosDeportivos;

import java.util.List;

//Se desea desarrollar una aplicación que concentre resultados de distintos encuentros deportivos (partido), y que
//distribuya los mismos a distintos servidores interesados en determinada información en particular.
//Cada vez que se lleva a cabo un partido, se ingresa en el servidor:
//el resultado (asumamos que simplemente se trata de un texto)
//los contrincantes (lista de nombres de contrincantes)
//el deporte
//Es importante tener en cuenta que los servidores que reciben la información, pueden estar suscriptos a un conjunto
//de deportes, por lo que podría pasar que haya servidores que solo quieran recibir información de Tenis, otros de
//Futbol y Basquet y otros de Ping Pong. Esto quiere decir, que debe tener en cuenta a qué información están
//suscriptos para luego enviar las notificaciones.
//Además, existen aplicaciones móviles que le permiten a una persona recibir los resultados de aquellos deportes o
//contrincantes que les interesa. Para ello, se suscriben a la información relacionada a un deporte y/o un contrincante
//particular.
public class App {
	List<Suscriptor> suscriptores;
	List<Partido> partidos; 
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		this.notificarNuevoPartido(partido);
	}

	private void notificarNuevoPartido(Partido partido) {
		for (Suscriptor suscriptor : this.suscriptores) {
			
		}
		
	}
	
}
