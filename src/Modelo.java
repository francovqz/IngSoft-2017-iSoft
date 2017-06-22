import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Modelo {

	List<Usuario> usuarios = new ArrayList<Usuario>();
	BdDStock datostock = new BdDStock();
	Boolean estaLogueado = false;
	Producto camisetaChelsea;
	Producto camisetaLiverpool;
	Producto camisetaCity;
	Producto camisetaUnited;
	
	
	public Modelo(){
		// Inicializo los productos
		Image img0 = new ImageIcon(getClass().getResource("camisetaa1.png")).getImage();
		camisetaChelsea = new Producto("Camiseta Chelsea temporada 13/14",img0,"$ 1400");
		Image img1 = new ImageIcon(getClass().getResource("camisetab1.png")).getImage();
		camisetaLiverpool = new Producto("Camiseta Liverpool temporada 16/17",img1,"$ 1200");
		Image img2 = new ImageIcon(getClass().getResource("camisetac1.png")).getImage();
		camisetaCity = new Producto("Camiseta Manchester City temp 15/16",img2,"$ 1300");
		Image img3 = new ImageIcon(getClass().getResource("camisetad1.png")).getImage();
		camisetaUnited = new Producto("Camiseta Manchester United temp 16/17",img3,"$ 1350");
	}
	
	public int agregarUsuario(){
		String user = Interfaz.textUsuarioAlta.getText();
		String password = Interfaz.textPasswordAlta.getText();
		
		for (Usuario usuario: usuarios){
			if(user.equals(usuario.getId())){
				return 0;
			}
		}
		
		Usuario userr = new Usuario(user, password);
		usuarios.add(userr);
		estaLogueado = true;
		return 1;
	}
	
	public int probarPass(){
		String user = Interfaz.textUsuarioLog.getText();
		String password = Interfaz.textPasswordLog.getText();
		
		for (Usuario usuario: usuarios){
			if(user.equals(usuario.getId())){
				if(password.equals(usuario.getPassword())){
					estaLogueado = true;
					return 1;
				}
			}
		}
		if (user.equals("administrador" ) && password.equals("administrador") ){
			estaLogueado = true;
			return 2;
		}	
		else 
			return 0;
	}
	
	public Producto getProducto (int i){
		switch (i){
		case 0:
			return camisetaChelsea;
		case 1:
			return camisetaLiverpool;
		case 2:
			return camisetaCity;
		case 3:
			return camisetaUnited;
		  }
		return null;
	}
	
	public BdDStock getBaseDeDatos(){
		return datostock;
	}
	
	public void actualizarBaseDeDatos(int num, String talle, String cant){
		int cantidad1;
		int cantidad2 = 0;
		int cantidad3 = Integer.parseInt(cant);
		switch (talle){
		case "S":
			cantidad2 = 0;
		case "M":
			cantidad2 = 1;
		case "L":
			cantidad2 = 2;
		}
		cantidad1 = datostock.getUnStock(num, cantidad2);
		cantidad1 = cantidad1 - cantidad3;
		datostock.setStock(num, cantidad2, cantidad1);
	}
}
