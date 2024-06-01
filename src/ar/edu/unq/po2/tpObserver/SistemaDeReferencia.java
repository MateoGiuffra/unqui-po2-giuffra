package ar.edu.unq.po2.tpObserver;
//Los miembros de un laboratorio están sumamente interesados en recibir las últimas actualizaciones de los artículos
//relacionados con sus temas de investigación. Es por ello que cuentan con un sistema de referencias y
//publicaciones bibliográficas. En este sistema es posible cargar artículos científicos indicando el titulo, los autores,
//las filiaciones de cada uno (Universidad, Laboratorio de Investigación, etc), el tipo de artículo, el lugar donde fue
//publicado y las palabras claves. Por otro lado, además de poder cargar artículos, los investigadores quieren poder
//suscribirse para recibir artículos de acuerdo a los criterios precedentes. Es decir, si un investigador desea recibir
//notificaciones para cada nueva publicación de la conferencia “Smalltalks” se registra al sistema y cada vez que se
//ingresa una nueva publicación de esa conferencia recibe un mensaje de aviso.
//Las suscripciones pueden combinar cualquiera de los campos que se incluyen en la carga.

import java.util.List;

public class SistemaDeReferencia {
	
	private List<Articulo> articulos;
	private List<SuscriptorPagina> suscriptores; 
	
	
	
	public void notify(Articulo articulo) {
		for (SuscriptorPagina suscriptor : this.suscriptores) {
			if (suscriptor.estaInteresadoEn(articulo.getTipoArticulo())) {
				suscriptor.update();
			}
		}
	}
	
	public void agregarSuscriptor(SuscriptorPagina suscriptorNuevo) {
		this.suscriptores.add(suscriptorNuevo);
	}
	
	public void eliminarSuscriptor(SuscriptorPagina suscriptorVigente) {
		this.suscriptores.remove(suscriptorVigente);
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
	}
	
}
