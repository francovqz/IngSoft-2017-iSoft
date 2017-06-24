import static org.junit.Assert.*;

import org.junit.Test;


public class ModeloTest {

	@Test
	public void testLogUsuario() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("pepe","123");
		assertEquals(modelo.getLogueo(), true);
	}
	
	@Test
	public void testValidarUsuario() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("pepe","123");
		assertEquals(modelo.validarUsuario("pepe","234"), 0);
	}

	@Test
	public void testValidarLogueo1() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("cristian", "1234");
		assertEquals(modelo.validarLogueo("cristian", "12345"), 0);
	}
	
	@Test
	public void testValidarLogueo2() {
		Modelo modelo = new Modelo();
		assertEquals(modelo.validarLogueo("cristian", "12345"), 0);
	}
	
	@Test
	public void testValidarLogueo3() {
		Modelo modelo = new Modelo();
		assertEquals(modelo.validarLogueo("administrador", "administrador"), 2);
	}

	@Test
	public void testActualizarBaseDeDatos() {
		fail("Not yet implemented");
	}

}