import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Modelo implements ISubject{

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
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	
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
	
	public Boolean validarCampos(String user, String password){
	
	if (user.length()==0 ){
		JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de usuario valido");
		return false;
	}
	
	else if(password.length() < 4){
		JOptionPane.showMessageDialog(null, "La contrase�a debe tener mas de 4 caracteres");
		return false;
	}
	return true;
	}
	
	public int validarUsuario(String user, String password){
		for (Usuario usuario: usuarios){
			if(user.equals(usuario.getId())){
				JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya est� en uso");
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
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public Boolean consultarBaseDeDatos(int producto, String talle, String cantidad){
		
		int tal=0;
		int cant = Integer.parseInt(cantidad);
		
		if(talle=="S"){
			tal= 0;
		}
		else if (talle=="M"){
			tal = 1;
		}
		else if (talle=="L"){
			tal = 2;
		}
		
		if (cant <= datostock.getUnStock(producto, tal)){
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
		
		if(talle=="S"){
			cantidad2= 0;
		}
		else if (talle=="M"){
			cantidad2 = 1;
		}
		else if (talle=="L"){
			cantidad2 = 2;
		}

		cantidad1 = datostock.getUnStock(num, cantidad2);
		cantidad1 = cantidad1 - cantidad3;
		datostock.setStock(num, cantidad2, cantidad1);
		notificar();
	}
	
	public void actualizarBaseDeDatos(int num, int talle, int cantidad){
		datostock.setStock(num, talle, cantidad);
		notificar();
	}
	
	public Boolean validarTarjeta(String numTarjeta){
		if(numTarjeta.matches("[0-9]*")){
			if (numTarjeta.length() == 8){
				return true;
			}
		}
		return false;
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

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
		
	}
	
	private void notificar(){
		for(IObserver observer : observers){
			observer.update();
		}
	}
}
