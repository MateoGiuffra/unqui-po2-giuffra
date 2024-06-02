package ar.edu.unq.po2.tpAdapter.EjAdapterInventado;

public class AdaptadorCentimetrosAPulgadas implements MedidaEnPulgadas {
	
	private MedidaEnCentrimetros medidaEnCentimetros;
	
	public AdaptadorCentimetrosAPulgadas(MedidaEnCentrimetros medidaEnCentimetros) {
		super();
		this.medidaEnCentimetros = medidaEnCentimetros;
	}


	@Override
	public double getMedida() {
		// TODO Auto-generated method stub
		return this.medidaEnCentimetros.getMedida() / 2.54;
	}

}
