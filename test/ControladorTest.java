import static org.junit.Assert.*;

import org.junit.Test;


public class ControladorTest {

	@Test
	public void testAgregarStock() {
	  Controlador controlador = new Controlador();
	  try {
		    controlador.agregarStock(1, 1, -1);
		    fail("Se esperaba excepcion Runtime");
		  } catch(RuntimeException e) {}
	}

}
