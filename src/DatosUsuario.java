
public class DatosUsuario {
	
	String usuario = "";
	String contraseña = "";
	
	public DatosUsuario()
	{
	}
	
	public int probarPass(){
		usuario = Interfaz.textField_2.getText();
		contraseña = Interfaz.passwordField.getText();
		
		if ((usuario.equals("cristianreb")&&contraseña.equals("15512287")) || (usuario.equals("administrador")&&contraseña.equals("administrador")))
		{
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public void agregarUsuario(String usuario, String password){
		
	}
	
}