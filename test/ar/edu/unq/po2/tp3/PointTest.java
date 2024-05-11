//package ar.edu.unq.po2.tp3;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class PointTest {
//	
//	private Point point = new Point(); 
//	private Point point2 = new Point(5,7);
//	private Point point2 = new Point(10,12);
//	@Test
//	void testNuevoPointTiene0EnXeY() {
//		assertEquals(0,point.getX());
//		assertEquals(0,point.getY());
//	}
//	
//	
//	@Test
//	void ResultadoSuma() {
//		// dado un segundo point con los valores 5 y 7, y otro de 10 y 12 deberia de dar como resultado 5 y  7
//		
//		point.sumarPoints(point2);
//		assertEquals(5,point.getX());
//		assertEquals(7,point.getY());
//	}
//	@Test
//	void settearPoint() {
//		
//		point.setXY(5, 7);
//		assertEquals(5,point.getX());
//		assertEquals(7,point.getY());
//	}
//}
