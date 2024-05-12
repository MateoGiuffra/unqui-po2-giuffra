package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class TestTrabajador {

	IngresoComun ingresoComun1;
	IngresoComun ingresoComun2;
	IngresoComun ingresoComun3;
	IngresoComun ingresoComun4;
	IngresoHorasExtras ingresoHorasExtras1;
	IngresoHorasExtras ingresoHorasExtras2;
	IngresoHorasExtras ingresoHorasExtras3;
	IngresoHorasExtras ingresoHorasExtras4;
	Trabajador worker; 
	ArrayList <Ingreso> ingresos;
	
	@BeforeEach
	public void SetUp() {
		ingresoComun1 = new IngresoComun(Month.of(3),"",3000);
		ingresoComun2 = new IngresoComun(Month.of(5),"",3000);
		ingresoComun3 = new IngresoComun(Month.of(1),"",3000);
		ingresoComun4 = new IngresoComun(Month.of(8),"",3000);
		ingresoHorasExtras1 = new IngresoHorasExtras(Month.of(2),"",3300, 5);
		ingresoHorasExtras2 = new IngresoHorasExtras(Month.of(6),"",3300, 5);
		ingresoHorasExtras3 = new IngresoHorasExtras(Month.of(10),"",3300, 5);
		ingresoHorasExtras4 = new IngresoHorasExtras(Month.of(9),"",3300, 5);
		ingresos =  new ArrayList<>();
		worker = new Trabajador(ingresos);
	
	}
	
	@Test
	void testTotalImpuestosAPagarEnLosMeses_1_3_5_8() {
		worker.recibirNuevoIngreso(ingresoComun1);
		worker.recibirNuevoIngreso(ingresoComun2);
		worker.recibirNuevoIngreso(ingresoComun3);
		worker.recibirNuevoIngreso(ingresoComun4);
		assertEquals(worker.getImpuestoAPagar(),240);
	}

	@Test
	void testTotalIngresosRecibidosEnLosMeses_1_3_5_8() {
		worker.recibirNuevoIngreso(ingresoComun1);
		worker.recibirNuevoIngreso(ingresoComun2);
		worker.recibirNuevoIngreso(ingresoComun3);
		worker.recibirNuevoIngreso(ingresoComun4);
		assertEquals(worker.getMontoImponible(),2940*4);
	}
	@Test
	void testTotalImpuestosAPagarEnLosMeses_2_6_9_10() {
		worker.recibirNuevoIngreso(ingresoHorasExtras1);
		worker.recibirNuevoIngreso(ingresoHorasExtras2);
		worker.recibirNuevoIngreso(ingresoHorasExtras3);
		worker.recibirNuevoIngreso(ingresoHorasExtras4);
		assertEquals(worker.getImpuestoAPagar(),0);
	}

	@Test
	void testTotalIngresosRecibidosEnLosMeses_2_6_9_10() {
		worker.recibirNuevoIngreso(ingresoHorasExtras1);
		worker.recibirNuevoIngreso(ingresoHorasExtras2);
		worker.recibirNuevoIngreso(ingresoHorasExtras3);
		worker.recibirNuevoIngreso(ingresoHorasExtras4);
		assertEquals(worker.getMontoImponible(),3300*4);
	}
	@Test
	void testTotalPercibidoDeTodosLosMeses() {
		worker.recibirNuevoIngreso(ingresoComun1);
		worker.recibirNuevoIngreso(ingresoComun2);
		worker.recibirNuevoIngreso(ingresoComun3);
		worker.recibirNuevoIngreso(ingresoComun4);
		worker.recibirNuevoIngreso(ingresoHorasExtras1);
		worker.recibirNuevoIngreso(ingresoHorasExtras2);
		worker.recibirNuevoIngreso(ingresoHorasExtras3);
		worker.recibirNuevoIngreso(ingresoHorasExtras4);
		assertEquals(worker.getTotalPercibido(),3000*4 + 3300*4);
	}

}
