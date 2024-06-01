package ar.edu.unq.po2.tpObserver;

public interface SuscriptorPagina {
	
	public abstract void update();
	public abstract boolean estaInteresadoEn(String tipoArticulo);
	
}
