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

}
