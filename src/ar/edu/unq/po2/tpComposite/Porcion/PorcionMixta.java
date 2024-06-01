package ar.edu.unq.po2.tpComposite.Porcion;
import java.util.List;

public class PorcionMixta implements Porcion {
		private List <Porcion> subPorciones; 
		
		public PorcionMixta(List<Porcion> porciones) {
			super();
			this.subPorciones = porciones; 
		}

		@Override
		public double gananciaAnual() {
			return this.subPorciones.isEmpty()? 0 : 
				this.subPorciones.stream().mapToDouble(p -> p.gananciaAnual()).sum() / this.subPorciones.size();
		}
}
