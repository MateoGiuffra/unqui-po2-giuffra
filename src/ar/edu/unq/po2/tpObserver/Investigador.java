package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Investigador implements SuscriptorPagina {

	private List<String> intereses;
	private boolean estaInformado;

	public Investigador( List<String> intereses, boolean estaInformado) {
		super();
		this.intereses = intereses;
		this.estaInformado = estaInformado;
	}

	public void suscribirseA(SistemaDeReferencia sistema) {
		sistema.agregarSuscriptor(this);
	}

	public void desuscribirseA(SistemaDeReferencia sistema) {
		sistema.eliminarSuscriptor(this);
	}

	public boolean isEstaInformado() {
		return estaInformado;
	}

	public void setEstaInformado(boolean estaInformado) {
		this.estaInformado = estaInformado;
	}

	public void agregarInteres(String interes) {
		
	}

	@Override
	public void update() {
		this.estaInformado = true;
	}

	@Override
	public boolean estaInteresadoEn(String tipoArticulo) {
		return this.intereses.contains(tipoArticulo);
	}

}
