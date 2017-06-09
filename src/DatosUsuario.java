import java.util.HashMap;
import java.util.Map;


public class DatosUsuario {
	
	Map<String, String> listaDatos = new HashMap<String, String>();
	String usuario = "";
	String contraseña = "";
	
	public DatosUsuario()
	{
		listaDatos.clear();
		//listaDatos.put("administrador", "administrador");
	}
	
	public int probarPass(){
		usuario = Interfaz.textField_2.getText();
		contraseña = Interfaz.passwordField.getText();
		
		/*if ((usuario.equals("cristianreb")&&contraseña.equals("15512287")) || (usuario.equals("administrador")&&contraseña.equals("administrador")))
		{
			return 1;
		}
		else {
			return 0;
		}*/
		
		for (String key : listaDatos.keySet()){
			if (usuario.equals(key)==true){
				if (contraseña.equals(listaDatos.get(key))){
					return 1;
				}
			}
		}
		if (usuario.equals("administrador" ) && contraseña.equals("administrador") )
			return 2;
		else 
			return 0;
	}
	
	public int agregarUsuario(){
		usuario = Interfaz.textField_2.getText();
		contraseña = Interfaz.passwordField.getText();
		
		if (listaDatos.containsKey(usuario)){
			return 0;
		}
		listaDatos.put(usuario, contraseña);
		return 1;
	}
	
}