package ar.edu.unq.po2.tp7;

import java.time.LocalTime;



public class ActividadSemanal {
	diaSemanal dia;
	LocalTime horaInicio;
	double duracion;
	Deporte deporte;
	
	
	public ActividadSemanal(diaSemanal dia, LocalTime horaDeInicio, double duracion, Deporte deporte) {
		super();
		this.dia = dia;
		this.horaInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	
	public double costoDia() {
		return duracion * dia.costo() + deporte.complejidad() * 200;
	}
	
	public diaSemanal getDia() {
		return dia;
	}
	public void setDia(diaSemanal dia) {
		this.dia = dia;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Deporte getDeporte() {
		return deporte;
	}
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public String imprimir() {
		return "Deporte: " + deporte.toString() + ". Dia: " + dia.toString() + " A LAS: " + horaInicio.toString() +  " Duracion: " +  this.duracion + " hora(s)."; 
	}
	

}
