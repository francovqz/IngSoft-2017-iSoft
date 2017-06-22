import java.awt.Image;

import javax.swing.ImageIcon;


public class Producto {

	String nombre;
	Image imagen;
	String precio;
	
	public Producto(String nombre, Image imagen, String precio){
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
		
	}
	
	public Image getImagen(){
		return imagen;
	}
	
	public void setImagen(Image img){
		imagen = img;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getPrecio(){
		return precio;
	}
}