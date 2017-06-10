package pensionesColegio;

import static org.junit.Assert.*;

import org.junit.Test;

public class PensionesColegioTest {

	@Test
	public void testSinrecargo() {
		assertEquals("No tiene recargo",PensionesColegio.pension("4"));
	}
	
	
	@Test
	public void test_recargo2() {
		assertEquals("Recargo del 2%",PensionesColegio.pension("18"));
	}
	
	
	
	@Test
	public void test_recargo4() {
		assertEquals("Recargo del 4%",PensionesColegio.pension("26"));
	}
	
	
	
	@Test
	public void test_vacio() {
		assertEquals("error",PensionesColegio.pension(""));
	}
	
	
	@Test
	public void test_decimal() {
		assertEquals("error",PensionesColegio.pension("3.8"));
	}
	
	
	@Test
	public void test_letras() {
		assertEquals("error",PensionesColegio.pension("ab"));
	}
	
	
	
	@Test
	public void test_negativo() {
		assertEquals("error",PensionesColegio.pension("-1"));
	}
	
	
	
	
	@Test
	public void test_cero() {
		assertEquals("error",PensionesColegio.pension("0"));
	}
	
	
	
	@Test
	public void test_mayor_treinta() {
		assertEquals("error",PensionesColegio.pension("32"));
	}
	
	
	// valores limite
	
	
	
	@Test
	public void test_valor1() {
		assertEquals("No tiene recargo",PensionesColegio.pension("1"));
	}
	
	
	
	@Test
	public void test_valor10() {
		assertEquals("No tiene recargo",PensionesColegio.pension("10"));
	}
	
	
	
	
	@Test
	public void test_valor11() {
		assertEquals("Recargo del 2%",PensionesColegio.pension("11"));
	}
	
	
	
	
	@Test
	public void test_valor20() {
		assertEquals("Recargo del 2%",PensionesColegio.pension("20"));
	}
	
	
	@Test
	public void test_valor21() {
		assertEquals("Recargo del 4%",PensionesColegio.pension("21"));
	}
	
	
	@Test
	public void test_valor30() {
		assertEquals("Recargo del 4%",PensionesColegio.pension("30"));
	}
	
	
	
	@Test
	public void test_valor31() {
		assertEquals("error",PensionesColegio.pension("31"));
	}
	
	
	

}
