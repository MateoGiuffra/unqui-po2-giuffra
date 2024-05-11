package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MultiploTest {
	
		
	@Test
	void testMultiploMayor() {
		Multiplo mult = new Multiplo();
		assertEquals(999, mult.multiploMayor(9,3));
	}

}
