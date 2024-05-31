package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {

	private ActividadSemanal act;
	
	@BeforeEach
	public void setUp() {
		act = new ActividadSemanal(diaSemanal.Martes, LocalTime.of(19,0), 2, Deporte.FUTBOL);
	}
	@Test
	void testImpresion() {
		assertEquals("Deporte: FUTBOL. Dia: Martes A LAS: 19:00 Duracion: 2.0 hora(s).", act.imprimir());
	}

}





