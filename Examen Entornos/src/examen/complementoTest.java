package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class complementoTest {

	@Test
	public void test1() {
		assertEquals("Complemento 500€", examen.complemento.comple("111;MariaPPPPPPPPPPPPPPP;5;NO"));
	}
	
	
	@Test (expected=Exception.class)
	public void testExcepcion() {
		assertEquals("Complemento 500€", examen.complemento.comple("000;MariaPPPPPPPPPPPPPPP;5;NO"));
	}
	

}
