
public class DatosUsuario {
	
	String usuario = "";
	String contrase�a = "";
	
	public DatosUsuario()
	{
	}
	
	public int probarPass(){
		usuario = Interfaz.textField_2.getText();
		contrase�a = Interfaz.passwordField.getText();
		
		if ((usuario.equals("cristianreb")&&contrase�a.equals("15512287")) || (usuario.equals("administrador")&&contrase�a.equals("administrador")))
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