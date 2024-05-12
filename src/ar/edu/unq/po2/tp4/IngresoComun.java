package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoComun extends Ingreso{
		
		public IngresoComun(Month mesDePercepcion,String concepto,double montoPercibido) {
			super(mesDePercepcion,concepto,montoPercibido);
		}
	
		@Override
		public double montoImpuestoAlTrabajador() {
			return 0.02 * this.montoPercibido;
		}
}

