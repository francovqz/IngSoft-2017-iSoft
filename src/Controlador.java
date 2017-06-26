
public class Controlador {
	
	private Modelo miModelo;
	private Interfaz miInterfaz;
	
	public Controlador(){
	}
	
	public void setModelo(Modelo modelo){
		miModelo = modelo;
	}
	
	public Modelo getModelo(){
		return miModelo;
	}
	
	public void setInterfaz(Interfaz interfaz){
		miInterfaz = interfaz;
	}
	
	public Interfaz getInterfaz(){
		return miInterfaz;
	}
	
	
	public int registrarUsuario(String userr, String passwordd){
		
		if(miModelo.validarCampos(userr, passwordd)){
			
		if(miModelo.validarUsuario(userr, passwordd)==1){
			miModelo.agregarUsuario(userr, passwordd);
			return 1;
		}
		else {
			return 0;
		}
		}
		return 0;
		
	}
	
	public int probarPass(String userr, String passwordd){
		if (miModelo.validarLogueo(userr, passwordd)==1){
			return 1;
		}
		else if (miModelo.validarLogueo(userr, passwordd)==2){
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public void numeroDeProducto(int i){
		miModelo.setNumProducto(i);
	}
	
	public void loguearse(){

		miModelo.setLogueo(true);
	}
	
	public void desloguearse(){
		miModelo.setLogueo(false);
	}
	
	public Boolean consultarStock(int producto, String talle, String cantidad){
		return miModelo.consultarBaseDeDatos(producto, talle, cantidad);
	}
	
	public void agregarStock(int producto, int talle, int cantidad){
		if (cantidad > 0){
		miModelo.actualizarBaseDeDatos(producto, talle, cantidad);
		}
		else {
			throw new RuntimeException("La cantidad debe ser positiva");
		}
	}
	
	public Boolean chequearTarjeta(String numTarjeta){
		return miModelo.validarTarjeta(numTarjeta);
	}
	
}
