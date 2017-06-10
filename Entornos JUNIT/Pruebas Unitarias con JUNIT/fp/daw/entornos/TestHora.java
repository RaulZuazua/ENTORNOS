package fp.daw.entornos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHora {

	@Test
	public void horaCorrecta() {
		
		assertTrue(Hora.validar("12:05"));
	}

}
