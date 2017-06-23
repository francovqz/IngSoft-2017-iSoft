
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
		
		if(miModelo.validarUsuario(userr, passwordd)==1){
			miModelo.agregarUsuario(userr, passwordd);
			return 1;
		}
		else {
			return 0;
		}
		
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
	
	
}
