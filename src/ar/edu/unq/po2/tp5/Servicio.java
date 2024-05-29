package ar.edu.unq.po2.tp5;

public class Servicio {
	double  costoPorUnidadConsumida;
	int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costoUnidad, int cantidadDeUnidades) {
		super();
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidades;
		this.costoPorUnidadConsumida = costoUnidad;
	}
	
	public double montoAPagar() {
		return this.costoPorUnidadConsumida * this.cantidadDeUnidadesConsumidas;
	}
}
