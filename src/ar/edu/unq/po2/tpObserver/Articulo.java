package ar.edu.unq.po2.tpObserver;

import java.util.List;

//Los miembros de un laboratorio están sumamente interesados en recibir las últimas actualizaciones de los artículos
//relacionados con sus temas de investigación. Es por ello que cuentan con un sistema de referencias y
//publicaciones bibliográficas. 

//En este sistema es posible cargar artículos científicos indicando el titulo, los autores,
//las filiaciones de cada uno (Universidad, Laboratorio de Investigación, etc), el tipo de artículo, el lugar donde fue
//publicado y las palabras claves. 
//Por otro lado, además de poder cargar artículos, los investigadores quieren poder
//suscribirse para recibir artículos de acuerdo a los criterios precedentes. Es decir, si un investigador desea recibir
//notificaciones para cada nueva publicación de la conferencia “Smalltalks” se registra al sistema y cada vez que se
//ingresa una nueva publicación de esa conferencia recibe un mensaje de aviso.
//Las suscripciones pueden combinar cualquiera de los campos que se incluyen en la carga.

public class Articulo {
	
	private String titulo;
	private List<Investigador> autores;
	private List<String> filaciones;
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;
	
	public String getTitulo() {
		return titulo;
	}
	
	
	
	public Articulo(String titulo, List<Investigador> autores, List<String> filaciones, String tipoArticulo,
			String lugarPublicacion, List<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filaciones = filaciones;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClaves = palabrasClaves;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Investigador> getAutores() {
		return autores;
	}
	public void setAutores(List<Investigador> autores) {
		this.autores = autores;
	}
	public List<String> getFilaciones() {
		return filaciones;
	}
	public void setFilaciones(List<String> filaciones) {
		this.filaciones = filaciones;
	}
	public String getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}




	
}
