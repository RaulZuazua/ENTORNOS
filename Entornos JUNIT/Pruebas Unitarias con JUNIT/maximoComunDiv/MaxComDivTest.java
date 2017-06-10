package maximoComunDiv;

import static org.junit.Assert.*;

import org.junit.Test;

import busquedaVector.BusquedaVector;

public class MaxComDivTest {

	@Test
	public void testNumIguales() {

		assertEquals(3, MaxComDiv.maxCom(3, 3));
	}

	
	@Test
	public void test_Num1_mayorque_Num2() {

		assertEquals(3, MaxComDiv.maxCom(27, 12));
	}
	
	
	
	@Test
	public void test_Num2_mayorque_Num1() {

		assertEquals(2, MaxComDiv.maxCom(4, 6));
	}
	
	
	
	
	@Test
	public void test_Numeros_Negativos_Iguales() {

		assertEquals(-1, MaxComDiv.maxCom(-4, -4));
	}
	
	
	
	@Test
	public void test_Num2_negativo() {

		assertEquals(-1, MaxComDiv.maxCom(6, -4));
	}
	
	
	
	@Test
	public void test_Num1_negativo() {

		assertEquals(-1, MaxComDiv.maxCom(-4, 6));
	}
	
	
	//valores limite
	
	
	@Test
	public void test_valorlimite_1_1() {

		assertEquals(1, MaxComDiv.maxCom(1, 1));
	}
	
	
	
	@Test
	public void test_valorlimite_2_1() {

		assertEquals(1, MaxComDiv.maxCom(2, 1));
	}
	
	
	
	@Test
	public void test_valorlimite_1_2() {

		assertEquals(1, MaxComDiv.maxCom(1, 2));
	}
	
	
	
	@Test
	public void test_valorlimite_0_0() {

		assertEquals(-1, MaxComDiv.maxCom(0, 0));
	}
	
	
	@Test
	public void test_valorlimite_1_0() {

		assertEquals(-1, MaxComDiv.maxCom(1, 0));
	}
	
	
	
	
	@Test
	public void test_valorlimite_0_menos_1() {

		assertEquals(-1, MaxComDiv.maxCom(0, -1));
	}
	
	
	@Test
	public void test_valorlimitemenos_1_0() {

		assertEquals(-1, MaxComDiv.maxCom(-1,0));
	}
	
	
	

}
