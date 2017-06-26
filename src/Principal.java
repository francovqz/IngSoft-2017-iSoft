
public class Principal {
	
	private static Interfaz miInterfaz;
	private static Modelo miModelo;
	private static Controlador miControlador;
	

	public static void main(String[] args) {
		
		iniciar();
	}
	
	private static void iniciar(){
		
		miInterfaz = new Interfaz();
		miModelo = new Modelo();
		miControlador = new Controlador();
		
		miInterfaz.setControlador(miControlador);
		miModelo.setControlador(miControlador);
		
		miControlador.setInterfaz(miInterfaz);
		miControlador.setModelo(miModelo);
		
		miModelo.addObserver(miInterfaz);
		
		miInterfaz.setVisible(true);
	}
}
