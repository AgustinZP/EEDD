package eedd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	

	@Test
	void testSumaPositivos() {
		System.out.println("Sumando dos números positivos...");
		Suma s=new Suma(2,3);
		assertTrue(s.sumaPositivos(2, 3)==5);
	}

	@Test
	void testSumaNegativos() {
		System.out.println("Sumando dos números negativos...");
		Suma s=new Suma(2,3);
		assertTrue(-6==s.sumaNegativos(-3, -3));
	}

	@Test
	void testSumaPositivoNegativo() {
		System.out.println("Sumando un numero negativo y otro positivo...");
		Suma s=new Suma(2,3);
		assertTrue(2==s.sumaPositivoNegativo(-5, 7));
	}
	

}
