package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoHorasExtras extends IngresoComun{
	double cantHorasExtras;
	
	public IngresoHorasExtras(Month mesDePercepcion,String concepto,double montoPercibido,double horasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantHorasExtras = horasExtras;
	}
	
	@Override
	public double montoImpuestoAlTrabajador() {
		return 0;
	}
	
}

