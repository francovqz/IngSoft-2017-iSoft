
public class DatosUsuario {
	
	String usuario = "";
	String contraseņa = "";
	
	public DatosUsuario()
	{
	}
	
	public int probarPass(){
		usuario = Interfaz.textField_2.getText();
		contraseņa = Interfaz.passwordField.getText();
		
		if ((usuario.equals("cristianreb")&&contraseņa.equals("15512287")) || (usuario.equals("administrador")&&contraseņa.equals("administrador")))
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