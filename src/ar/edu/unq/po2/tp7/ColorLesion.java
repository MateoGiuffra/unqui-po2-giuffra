package ar.edu.unq.po2.tp7;

//Desarrolle un enumerativo para representar el color que pueden tomar las lesiones
//dermatológicas
//● Rojo
//● Gris
//● Amarillo
//● Miel
//En todos los casos debe tener una descripción predefinida, el nivel de riesgo y saber cuál es
//el próximo color en el proceso de maduración. Asumamos rotativo, es decir cuando
//pregunto el siguiente de Miel debe responder Rojo.
//Realice test para probar las funcionalidades pedidas.

public enum ColorLesion {
	
	Rojo{
		@Override
		public int nivelDeRiesgo() {return 1;}
		
		@Override
		public String Descripcion() {
			return "Descripcion Rojo";
		}
		@Override
		public ColorLesion colorSig() { return Gris; }
	},
	Gris{
		@Override
		public int nivelDeRiesgo() {return 2;}
		
		@Override
		public String Descripcion() {
			return "Descripcion Gris";
		}
		@Override
		public ColorLesion colorSig() { return Amarillo; }
	},
	Amarillo{
		@Override
		public int nivelDeRiesgo() {return 3;}
		
		@Override
		public String Descripcion() {
			return "Descripcion Amarillo";
		}
		@Override
		public ColorLesion colorSig() { return Miel; }
	},
	Miel{
		@Override
		public int nivelDeRiesgo() {return 4;}
		
		@Override
		public String Descripcion() {
			return "Descripcion Miel";
		}
		@Override
		public ColorLesion colorSig() { return Rojo; }
	};
	abstract public ColorLesion colorSig();
	abstract public String Descripcion();
	abstract int nivelDeRiesgo();
}
