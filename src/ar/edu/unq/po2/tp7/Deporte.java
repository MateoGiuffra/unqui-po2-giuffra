package ar.edu.unq.po2.tp7;
//b-Desarrolle un enumerativo para representar los 5 deporte. El enumerativo debe tener un
//atributo que sea la complejidad.
//● RUNNING: complejidad 1
//● FUTBOL: complejidad 2
//● BASKET: complejidad 2
//● TENNIS: complejidad 3
//● JABALINA: complejidad 4

public enum Deporte {
	RUNNING{
		@Override 
		public int complejidad() { return 1;}
	},FUTBOL{
		@Override 
		public int complejidad() { return 2;}
	},BASKET{
		@Override 
		public int complejidad() { return 2;}
	},TENNIS{
		@Override 
		public int complejidad() { return 3;}
	},JABALINA{
		@Override 
		public int complejidad() { return 4;}
	};
	abstract int complejidad();
}
