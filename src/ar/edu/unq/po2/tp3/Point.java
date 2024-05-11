//package ar.edu.unq.po2.tp3;
//
////Diseñe e implemente la clase Point (punto). La misma debe tener el siguiente comportamiento:
////1. Debe ser posible crearse indicando como referencia los valores x e y
////2. También debe ser posible crear un punto directamente sin enviarles parámetros, en 
//// este caso el punto
////debe crearse en las coordenadas (0,0).
////3. Debe ser posible mover un punto a otra posición.
////4. Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
//
//
//public class Point {
//	int x;
//	int y;
//	
//	
//	public Point(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
//	}
//	
//	
//	public int getX() {
//		return x;
//	}
//
//
//	protected void setX(int x) {
//		this.x = x;
//	}
//
//
//	public int getY() {
//		return y;
//	}
//
//
//	protected void setY(int y) {
//		this.y = y;
//	}
//
//
//	public void setXY(int x_, int y_) {
//		this.x = x_;  
//		this.y = y_; 
//	}
//	
//	
//	public Point sumarPoints(Point point) {
//		this.x += point.getX();
//		this.y += point.getY(); 
//	}
//}
