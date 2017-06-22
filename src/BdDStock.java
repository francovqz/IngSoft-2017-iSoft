
public class BdDStock {

	private int [][] stock = {{3,3,3}, {3,3,3}, {3,3,3}, {3,3,3}}; //{{3,3,3}, {3,3,3}, {3,3,3}, {3,3,3}};
	private static BdDStock uniqueInstance = null;
	
	/*
	 * private DatosStock(){ // Patron Singleton 
	}*/
	
	public BdDStock(){
	}
	
	public int[][] getStock(){
		return stock;
	}
	
	public int getUnStock(int fila, int columna){
		return stock[fila][columna];
	}
	
	public void setStock(int fila, int columna, int nuevaCantidad){
		stock[fila][columna] = nuevaCantidad;
	}
	
	public static BdDStock getInstance(){ // Metodo para adquirir el unico objeto posible de DatosStock
		if  (uniqueInstance==null){
			 uniqueInstance= new BdDStock();
		}
		return uniqueInstance;
	}
}
