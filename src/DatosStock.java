
public class DatosStock {
	private int [][] stock = {{10,10,10}, {10, 10, 10}, {10,10,10}, {10,10,10}};
	private static DatosStock uniqueInstance = null;
	
	private DatosStock(){ // Patron Singleton 
	}
	
	public int[][] getStock(){
		return stock;
	}
	
	public void setStock(int fila, int columna, int nuevaCantidad){
		stock[fila][columna] = nuevaCantidad;
	}
	
	public static DatosStock getInstance(){ // Metodo para adquirir el unico objeto posible de DatosStock
		if  (uniqueInstance==null){
			 uniqueInstance= new DatosStock();
		}
		return uniqueInstance;
	}
}