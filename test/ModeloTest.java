import static org.junit.Assert.*;

import org.junit.Test;


public class ModeloTest {

	@Test
	public void testLogUsuario() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("pepe","1234");
		assertEquals(modelo.getLogueo(), true);
	}
	
	@Test
	public void testValidarCampos() {
		Modelo modelo = new Modelo();
		assertEquals(modelo.validarCampos("pepe", "123"), false);
	}
	
	@Test
	public void testValidarUsuario() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("pepe","1234");
		assertEquals(modelo.validarUsuario("pepe","2345"), 0);
	}

	@Test
	public void testValidarLogueo1() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("cristian", "12345");
		assertEquals(modelo.validarLogueo("cristian", "123456"), 0);
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
	public void testAgregarUsuario() {
		Modelo modelo = new Modelo();
		modelo.agregarUsuario("Pepe", "123");
		Boolean esta = false;
		for (Usuario usuario : modelo.getUsuarios()){
			if (usuario.equals("Pepe")){
				esta = true;
			}
		}
		if (esta){
			fail("La prueba fallo");
		}
	}

	@Test
	public void testActualizarBaseDeDatos() {
		Modelo modelo = new Modelo();
		modelo.getBaseDeDatos().setStock(1, 1, 4);
		modelo.actualizarBaseDeDatos(1, "M", "3");
		assertEquals(modelo.getBaseDeDatos().getUnStock(1,1), 1);
		
	}
	
	@Test
	public void testConsultarBaseDeDatos() {
		Modelo modelo = new Modelo();
		modelo.getBaseDeDatos().setStock(1, 1, 3);
		assertEquals(modelo.consultarBaseDeDatos(1, "M", "4"), false);
	}

}