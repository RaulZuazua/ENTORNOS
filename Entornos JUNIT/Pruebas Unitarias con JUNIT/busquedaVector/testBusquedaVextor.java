package busquedaVector;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBusquedaVextor {

	@Test
	public void testEncontrado() {
		
		int vector [] = {1,-7,3,2,-8,6,10};
		assertEquals(3, BusquedaVector.busquedaVector(2, vector));

	}
	
	
	
	
	@Test
	public void testNoEncontrado() {
		
		int vector [] = {1,-7,3,2,-8,6,10};
		assertEquals(-1, BusquedaVector.busquedaVector(15, vector));

	}
	
	
	
	
	
	@Test
	public void testPrimerElemento() {
		
		int vector [] = {1,-7,3,2,-8,6,10};
		assertEquals(0,BusquedaVector.busquedaVector(1, vector));

	}
	
	
	
	
	@Test
	public void testUltimoElemento() {
		
		int vector [] = {1,-7,3,2,-8,6,10};
		assertEquals(vector.length-1,BusquedaVector.busquedaVector(10, vector));

	}
	
	
	
	
	
	
	
	
	
	
}
