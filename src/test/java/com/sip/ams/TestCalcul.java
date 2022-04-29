package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcul {

	@Test
	void testSomme() {
		assertTrue(Calcul.somme(10, 2)==12);
	}
	

	@Test
	void testProduit() {
		assertTrue(Calcul.produit(10, 2)==20);
	}
	
	@Test
	void testDivision() {
		assertTrue(Calcul.division(10, 2)==5);
	}
	
	@Test
	void testModulo() {
		assertTrue(Calcul.modulo(10, 3)==1);
	}

}
