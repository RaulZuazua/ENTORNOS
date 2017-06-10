package fp.daw.entornos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHora2 {

	@Test
	public void testHoraCorrecta() {
		
		assertTrue(Hora.validar("16", "43"));
	}
	
	
	@Test(expected = Exception.class)
	public void testDosNulos() {
		
		Hora.validar(null, null);
	}
	
	
	
	@Test(expected = Exception.class)
	public void testDdecimales() {
		
		Hora.validar("11.3", "38");
	}
	
	
	
	@Test(expected = Exception.class)
	public void testCaracteresNoNumericos() {
		
		Hora.validar("h", "38");
	}
	
	
	@Test(expected = Exception.class)
	public void testMinutosConDecimales() {
		
		Hora.validar("11", "1.3");
	}
	
	@Test(expected = Exception.class)
	public void testMinutosNoNumericos() {
		
		Hora.validar("11", "mm");
	}
	
	
	
	@Test(expected = Exception.class)
	public void testHoraNegativa() {
		
		Hora.validar("-11", "55");
	}
	
	
	@Test(expected = Exception.class)
	public void testMinutosNegativos() {
		
		Hora.validar("11", "-55");
	}
	
	
	@Test
	public void testMinutosIncorrectos() {
		
		assertFalse(Hora.validar("24", "12"));
	}
	
	
	@Test
	public void testHoraIncorrectos() {
		
		assertFalse(Hora.validar("2", "63"));
	}
	
	

}
