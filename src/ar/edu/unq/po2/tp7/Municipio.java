package ar.edu.unq.po2.tp7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//c-Implemente un método para resolver cada una de las siguientes consultas utilizando
//Streams
//● Todas las actividades de FUTBOL. Devuelve List<ActividadSemanal>
//● Todas las actividades de una complejidad recibida como parámetro. Devuelve
//List<ActividadSemanal>
//● Cantidad de horas totales de actividadesSemanales que ofrece el Municipio

//● La actividadSemanal de menor costo para un Deporte (FUTBOL por ejemplo) de
//interés recibido por parámetro. Si hay más de uno con el mismo costo es indistinto
//cual devuelve. Devuelve una ActividadSemanal


//Se sugiere investigar la función min de streams y el uso del m étodo
//Comparator.comparing().

//● Para cada deporte (FUTBOL, TENNIS, etc.), la actividadSemanal más económica.
//Devuelve Map<Actividad, ActividadSemanal>. Si hay más de una con el mismo
//costo para el mismo deporte, es indistinto cual devuelve.
//Se sugiere revisar el método Collectors.groupingBy.
//Aclaración: Este ejercicio tiene un nivel de complejidad mayor.


public class Municipio {
	diaSemanal dia;
	private List<ActividadSemanal> actividades;
	
	public List<ActividadSemanal> actsDeFutbol(){
		return this.actividades.stream().filter(a -> a.getDeporte() == Deporte.FUTBOL).toList();
	}
	public List<ActividadSemanal> actsDeComplejidad(int complejidad){
		return this.actividades.stream().filter(a -> a.getDeporte().complejidad() == complejidad).toList();
	}
	public double cantHorasTotales(){
		return this.actividades.stream().mapToDouble(a -> a.getDuracion() ).sum();
	}
	public ActividadSemanal actConMenorCosto(Deporte deporte) {
		return this.actividades.stream().filter(a -> a.getDeporte() == deporte). // filtro los de el deporte dado. 
				min((ActividadSemanal a1, ActividadSemanal a2)-> Double.compare(a1.costoDia(), a2.costoDia())).get(); // devuelvo el de menor costo.
	}
	public  Map<Deporte, ActividadSemanal> deporteConActMenosCostosa(){
		return this.actividades.stream().collect(Collectors.toMap(ActividadSemanal :: getDeporte, a -> this.actConMenorCosto(a.getDeporte())));

	}
	public  Map<Deporte, ActividadSemanal> deporteConActMenosCostosaa(){
		 Map<Deporte, ActividadSemanal> map = new HashMap<>();
		this.actividades.forEach(actividad-> map.put(actividad.getDeporte(), this.actConMenorCosto(actividad.getDeporte())));
		return map;
	}
	
}
