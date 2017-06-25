import static org.junit.Assert.*;

import org.junit.Test;


public class IntegracionTest {
	
	@Test
	public void testModeloControlador1() {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		modelo.setControlador(controlador);
		
		controlador.registrarUsuario("Pepe", "12345");
		assertEquals(controlador.registrarUsuario("Pepe", "98765"), 0);
	}
	
	@Test
	public void testModeloControlador2() {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		modelo.setControlador(controlador);
		
		controlador.agregarStock(2,0,3);
		assertEquals(modelo.consultarBaseDeDatos(2,"S","4"), false);
	}
	
	@Test
	public void testModeloControlador3() {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		modelo.setControlador(controlador);
		
		controlador.registrarUsuario("Juan", "159845");
		assertEquals(modelo.validarLogueo("Juan", "159845"), 1);
	}
	
	@Test
	public void testModeloControlador4() {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		modelo.setControlador(controlador);
		
		controlador.agregarStock(2,0,8);
		modelo.actualizarBaseDeDatos(2, "S", "3");
		modelo.actualizarBaseDeDatos(2, "S", "3");
		
		assertEquals(modelo.getBaseDeDatos().getUnStock(2, 0), 2);
	}
	
	@Test
	public void testControladorInterfaz1() {
		Interfaz interfaz = new Interfaz();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		
		controlador.setModelo(modelo);
		controlador.setInterfaz(interfaz);
		interfaz.setControlador(controlador);
		
		controlador.agregarStock(2, 0, 7);
		interfaz.actualizarPanelAdmin();
		assertEquals(interfaz.getTabla().getValueAt(2,0), 7);
	}
	
	
	

}
