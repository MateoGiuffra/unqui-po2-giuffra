package ar.edu.unq.po2.tp7;

public enum diaSemanal {
	Lunes{
		@Override 
			public double costo() {return 500;}},
	Martes{
		@Override public double costo() {return 500;}},
	Miercoles{
			@Override public double costo() {return 500;}},
	Jueves{
				@Override public double costo() {return 1000;}},
	Viernes{
					@Override public double costo() {return 1000;}},
	Sabado{
						@Override public double costo() {return 1000;}},
	Domingo{
							@Override public double costo() {return 1000;}};
	abstract double costo();
}
