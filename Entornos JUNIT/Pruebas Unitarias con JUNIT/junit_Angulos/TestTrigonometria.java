package junit_Angulos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTrigonometria {

	
	
	
	@Test
	public void testAgudo() {
		
		assertEquals("Agudo",Trigonometria.ClasificarAngulo(2,2));
	}

	@Test
	public void testRecto() {
		
		assertEquals("Recto",Trigonometria.ClasificarAngulo(0,2));
	}
	
	
	@Test
	public void testObtuso() {
		
		assertEquals("Obtuso",Trigonometria.ClasificarAngulo(-2,2));
	}
	
	
	@Test (expected=RuntimeException.class)
	public void testPuntoEnOrigen() {
		
		Trigonometria.ClasificarAngulo(0,0);
	}
	
	
	
	@Test (expected=RuntimeException.class)
	public void testPuntoEnPlanoInferiorDerecho() {
		
		Trigonometria.ClasificarAngulo(2,-2);
	}
	
	
	
	@Test (expected=RuntimeException.class)
	public void testPuntoEnEjeYNegativo() {
		
		Trigonometria.ClasificarAngulo(0,-2);
	}
	
	
	
	@Test (expected=RuntimeException.class)
	public void testPuntoEnPlanoInferiorIzquierdo() {
		
		Trigonometria.ClasificarAngulo(-2,-2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
