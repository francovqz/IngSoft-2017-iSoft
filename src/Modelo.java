import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Modelo {

	private Controlador miControlador;
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private BdDStock datostock;
	private Boolean estaLogueado = false;
	private Producto camisetaChelsea;
	private Producto camisetaLiverpool;
	private Producto camisetaCity;
	private Producto camisetaUnited;
	private int numProducto = 0;
	private String talleProducto;
	private String cantidadProducto;
	
	public Modelo(){
		
		miControlador = new Controlador();
		datostock = datostock.getInstance();
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
	
	public void setControlador(Controlador controlador){
		miControlador = controlador;
	}
	
	public Controlador getControlador(){
		return miControlador;
	}
	
	public void agregarUsuario(String user, String password){
		
		Usuario userr = new Usuario(user, password);
		usuarios.add(userr);
		estaLogueado = true;
	}
	
	public int validarUsuario(String user, String password){
		for (Usuario usuario: usuarios){
			if(user.equals(usuario.getId())){
				return 0;
			}
		}
		
		return 1;
	}
	
	public int validarLogueo(String user, String password){
		
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
	
	public Boolean consultarBaseDeDatos(int producto, String talle, String cantidad){
		
		int tal=0;
		int cant = Integer.parseInt(cantidad);
		
		switch (talle){
		case "S":
			tal = 0;
		case "M":
			tal = 1;
		case "L":
			tal = 2;
		}
		
		if (cant >= datostock.getUnStock(producto, tal)){
			return true;
		}
		else {
			return false;
		}
		
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
	
	public void setNumProducto(int i){
		numProducto = i;
	}
	
	public int getNumProducto(){
		return numProducto;
	}
	
	public void setTalleProducto(String s){
		talleProducto = s;
	}
	
	public String getTalleProducto(){
		return talleProducto;
	}
	
	public void setCantidadProducto(String s){
		cantidadProducto = s;
	}
	
	public String getCantidadProducto(){
		return cantidadProducto;
	}
	
	public void setLogueo(Boolean v){
		estaLogueado = v;
	}
	
	public Boolean getLogueo(){
		return estaLogueado;
	}
}
