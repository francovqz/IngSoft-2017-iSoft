import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import java.awt.CardLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.SystemColor;

import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz extends JFrame implements IObserver {

	private Controlador miControlador;
	
	private JPanel contentPane;
	private JPanel PanelInicio;
	private JPanel AltaUsuario;
	private JPanel LogueoUsuario;
	private JPanel PanelCatalogo;
	private JPanel PanelDescripcion;
	private JPanel PanelConfirmar;
	private JPanel PanelNoIngreso;
	private JPanel PanelAdmin;
	
	public static JTextField textUsuarioAlta;
	public static JPasswordField textPasswordAlta;
	public static JTextField textUsuarioLog;
	public static JPasswordField textPasswordLog;
	public static JTextField txtTarjeta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField Cantidad;
	
	private static JLabel labelImagen;
	private static JLabel labelTitulo;
	private static JLabel labelPrecio;
	private static JTable table;
	
	 /* Create the frame.
	 */
	public Interfaz() {
		
		miControlador = new Controlador();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		////////////////////////////////////////// Panel Inicio /////////////////////////////////////////////////////////////////
		
		PanelInicio = new JPanel();
		contentPane.add(PanelInicio, "name_100540470149917");
		PanelInicio.setLayout(null);
		
		JLabel lblBienvenidoACompradesdetucasacom = new JLabel("Bienvenido a CompraDesdeTuCasa.com");
		lblBienvenidoACompradesdetucasacom.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		lblBienvenidoACompradesdetucasacom.setBounds(60, 29, 469, 61);
		PanelInicio.add(lblBienvenidoACompradesdetucasacom);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(AltaUsuario);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(29, 136, 108, 172);
		PanelInicio.add(btnRegistrarse);
		
		JButton btnVerCatlogo = new JButton("Ver Cat\u00E1logo");
		btnVerCatlogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnVerCatlogo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerCatlogo.setBounds(178, 136, 228, 172);
		PanelInicio.add(btnVerCatlogo);
		
		JButton btnSobreNosotros = new JButton("Loguearse");
		btnSobreNosotros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSobreNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();				
				contentPane.add(LogueoUsuario);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnSobreNosotros.setBounds(444, 136, 108, 172);
		PanelInicio.add(btnSobreNosotros);
		
		////////////////////////////////////////// Alta usuario /////////////////////////////////////////////////////////////////
		
		AltaUsuario = new JPanel();
		contentPane.add(AltaUsuario, "name_100537623115554");
		AltaUsuario.setLayout(null);
		
		JLabel lblPorFavorComplete = new JLabel("Por favor, complete los siguientes datos a continuaci\u00F3n:");
		lblPorFavorComplete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPorFavorComplete.setBounds(10, 77, 363, 23);
		AltaUsuario.add(lblPorFavorComplete);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(72, 169, 68, 14);
		AltaUsuario.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasea.setBounds(72, 217, 89, 35);
		AltaUsuario.add(lblContrasea);
		
		textUsuarioAlta = new JTextField();
		textUsuarioAlta.setBounds(180, 159, 223, 35);
		AltaUsuario.add(textUsuarioAlta);
		textUsuarioAlta.setColumns(10);
		
		textPasswordAlta = new JPasswordField();
		textPasswordAlta.setBounds(180, 217, 223, 35);
		AltaUsuario.add(textPasswordAlta);
		
		JCheckBox chckbxHeLeidoY = new JCheckBox("He leido y acepto los t\u00E9rminos y condiciones");
		chckbxHeLeidoY.setBounds(180, 289, 235, 23);
		AltaUsuario.add(chckbxHeLeidoY);
		
		JButton btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String user = textUsuarioAlta.getText();
			String password = textPasswordAlta.getText();
			
			if (miControlador.registrarUsuario(user, password)==1){
			JOptionPane.showMessageDialog(null, "Felicitaciones, usted es un nuevo usuario de la página");
			contentPane.removeAll();				
			contentPane.add(PanelCatalogo);
			contentPane.repaint();
			contentPane.revalidate();
			}
			else {
			}
			}
		});
		btnDarDeAlta.setBounds(461, 368, 103, 23);
		AltaUsuario.add(btnDarDeAlta);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs.setBounds(10, 368, 89, 23);
		AltaUsuario.add(btnAtrs);
		
		////////////////////////////////////////// Logueo Usuario /////////////////////////////////////////////////////////////////
		
		LogueoUsuario = new JPanel();
		contentPane.add(LogueoUsuario, "name_100533220171512");
		LogueoUsuario.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 574, 402);
		LogueoUsuario.add(panel_7);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(72, 138, 68, 14);
		panel_7.add(label_1);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(72, 196, 83, 35);
		panel_7.add(label_2);
		
		textUsuarioLog = new JTextField();
		textUsuarioLog.setColumns(10);
		textUsuarioLog.setBounds(180, 130, 223, 35);
		panel_7.add(textUsuarioLog);
		
		textPasswordLog = new JPasswordField();
		textPasswordLog.setBounds(180, 196, 223, 35);
		panel_7.add(textPasswordLog);
		
		JCheckBox chckbxRecordar = new JCheckBox("Recordar");
		chckbxRecordar.setBounds(180, 266, 235, 23);
		panel_7.add(chckbxRecordar);
		
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String user = Interfaz.textUsuarioLog.getText();
				String password = Interfaz.textPasswordLog.getText();
				
				if (miControlador.probarPass(user, password)==1){
					contentPane.removeAll();				
					contentPane.add(PanelCatalogo);
					contentPane.repaint();
					contentPane.revalidate();
				}
				else if(miControlador.probarPass(user, password)==2){
					update();
					contentPane.removeAll();				
					contentPane.add(PanelAdmin);
					contentPane.repaint();
					contentPane.revalidate();
				}
				else {
					JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrectos");
				}
			}
		});
		btnIngresar.setBounds(475, 368, 89, 23);
		panel_7.add(btnIngresar);
		
		JButton button_1 = new JButton("Atr\u00E1s");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_1.setBounds(10, 368, 89, 23);
		panel_7.add(button_1);
		
		JLabel lblCompradesdetucasacom = new JLabel("CompraDesdeTuCasa.com");
		lblCompradesdetucasacom.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		lblCompradesdetucasacom.setBounds(134, 43, 323, 35);
		panel_7.add(lblCompradesdetucasacom);
		
		////////////////////////////////////////// Panel Catalogo /////////////////////////////////////////////////////////////////
		
		PanelCatalogo = new JPanel();
		contentPane.add(PanelCatalogo, "name_100528745594371");
		PanelCatalogo.setLayout(null);
		
		JLabel label1 = new JLabel("");
		Image img1 = new ImageIcon(getClass().getResource("camisetaa.png")).getImage();
		label1.setIcon(new ImageIcon(img1));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(292, 110, 100, 106);
		PanelCatalogo.add(label1);
		
		JLabel label2 = new JLabel("");
		Image img2 = new ImageIcon(getClass().getResource("camisetab.png")).getImage();
		label2.setIcon(new ImageIcon(img2));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(42, 97, 100, 135);
		PanelCatalogo.add(label2);
		
		JLabel label3 = new JLabel("");
		Image img3 = new ImageIcon(getClass().getResource("camisetac.png")).getImage();
		label3.setIcon(new ImageIcon(img3));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(31, 252, 118, 127);
		PanelCatalogo.add(label3);
		
		
		JLabel label4 = new JLabel("");
		Image img4 = new ImageIcon(getClass().getResource("camisetad.png")).getImage();
		label4.setIcon(new ImageIcon(img4));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(274, 252, 118, 127);
		PanelCatalogo.add(label4);
		
		JLabel lblNewLabel = new JLabel("Camiseta Chelsea 13/14");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(62, 78, 162, 23);
		PanelCatalogo.add(lblNewLabel);
		
		JLabel lblCamisetaLiverpool = new JLabel("Camiseta Liverpool 16/17");
		lblCamisetaLiverpool.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCamisetaLiverpool.setBounds(303, 78, 162, 23);
		PanelCatalogo.add(lblCamisetaLiverpool);
		
		JLabel lblCamisetaManCity = new JLabel("Camiseta Man City 15/16");
		lblCamisetaManCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCamisetaManCity.setBounds(62, 229, 162, 23);
		PanelCatalogo.add(lblCamisetaManCity);
		
		JLabel lblCamisetaManUnited = new JLabel("Camiseta Man United 16/17");
		lblCamisetaManUnited.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCamisetaManUnited.setBounds(302, 227, 181, 23);
		PanelCatalogo.add(lblCamisetaManUnited);
		
		
		JButton btnNewButton = new JButton("Ver producto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.numeroDeProducto(0);
				actualizarPanelDescripcion();
				contentPane.removeAll();				
				contentPane.add(PanelDescripcion);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setBounds(141, 144, 118, 32);
		PanelCatalogo.add(btnNewButton);
		
		JButton button = new JButton("Ver producto");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.numeroDeProducto(1);
				actualizarPanelDescripcion();
				contentPane.removeAll();				
				contentPane.add(PanelDescripcion);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button.setBounds(402, 144, 109, 32);
		PanelCatalogo.add(button);
		
		JButton button_2 = new JButton("Ver producto");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.numeroDeProducto(2);
				actualizarPanelDescripcion();
				contentPane.removeAll();				
				contentPane.add(PanelDescripcion);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_2.setBounds(141, 299, 118, 32);
		PanelCatalogo.add(button_2);
		
		JButton button_3 = new JButton("Ver producto");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.numeroDeProducto(3);
				actualizarPanelDescripcion();
				contentPane.removeAll();				
				contentPane.add(PanelDescripcion);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_3.setBounds(402, 299, 109, 32);
		PanelCatalogo.add(button_3);
		
		JLabel lblCatalogoDeProductos = new JLabel("Catalogo de Productos");
		lblCatalogoDeProductos.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		lblCatalogoDeProductos.setBounds(162, 11, 303, 56);
		PanelCatalogo.add(lblCatalogoDeProductos);
		
		JButton btnAtrs_2 = new JButton("Atr\u00E1s");
		btnAtrs_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.desloguearse();
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs_2.setBounds(10, 368, 89, 23);
		PanelCatalogo.add(btnAtrs_2);
		
		////////////////////////////////////////// Panel Descripcion /////////////////////////////////////////////////////////////////
		
		PanelDescripcion = new JPanel();
		contentPane.add(PanelDescripcion, "name_100515180397487");
		PanelDescripcion.setLayout(null);
		
		////////////////////////////////////////// Panel No ingreso /////////////////////////////////////////////////////////////////
		
		PanelNoIngreso = new JPanel();
		contentPane.add(PanelNoIngreso, "name_100507420435700");
		PanelNoIngreso.setLayout(null);
		
		JTextPane txtpnParaComprarEste = new JTextPane();
		txtpnParaComprarEste.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnParaComprarEste.setBackground(SystemColor.control);
		txtpnParaComprarEste.setText("Para comprar este producto, usted debe ser un usuario registrado de la p\u00E1gina. Si usted ya posee una cuenta, haga click en el bot\u00F3n \"Ingresar\", de lo contrario debe darse de alta. No se preocupe, solo le tomara unos minutos.");
		txtpnParaComprarEste.setBounds(21, 50, 522, 94);
		PanelNoIngreso.add(txtpnParaComprarEste);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(AltaUsuario);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(55, 202, 178, 130);
		PanelNoIngreso.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ingresar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(LogueoUsuario);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(344, 202, 178, 130);
		PanelNoIngreso.add(btnNewButton_2);
		
		////////////////////////////////////////// Panel Confirmar /////////////////////////////////////////////////////////////////
		
		PanelConfirmar = new JPanel();
		contentPane.add(PanelConfirmar, "name_100503184104587");
		PanelConfirmar.setLayout(null);
		
		////////////////////////////////////////// Panel Admin /////////////////////////////////////////////////////////////////
		
		PanelAdmin = new JPanel();
		contentPane.add(PanelAdmin, "name_44137247085231");
		
	}
	
	public void actualizarPanelDescripcion(){
		PanelDescripcion.removeAll();
		
		labelImagen = new JLabel("");
		Image img8 = miControlador.getModelo().getProducto(miControlador.getModelo().getNumProducto()).getImagen();
		labelImagen.setIcon(new ImageIcon(img8));
		labelImagen.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagen.setBounds(10, 67, 275, 300);
		PanelDescripcion.add(labelImagen);
		
		String variable1 = miControlador.getModelo().getProducto(miControlador.getModelo().getNumProducto()).getNombre();
		labelTitulo = new JLabel(variable1);
		labelTitulo.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		labelTitulo.setBounds(23, 24, 515, 32);
		PanelDescripcion.add(labelTitulo);
		
		String variable2 = miControlador.getModelo().getProducto(miControlador.getModelo().getNumProducto()).getPrecio();
		labelPrecio = new JLabel(variable2);
		labelPrecio.setFont(new Font("Tahoma", Font.PLAIN, 34));
		labelPrecio.setBounds(343, 106, 132, 54);
		PanelDescripcion.add(labelPrecio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L"}));
		comboBox.setBounds(428, 200, 46, 20);
		PanelDescripcion.add(comboBox);
		
		JLabel lblTalle = new JLabel("Talle");
		lblTalle.setBounds(343, 203, 46, 14);
		PanelDescripcion.add(lblTalle);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1.setBounds(428, 251, 47, 20);
		PanelDescripcion.add(comboBox_1);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(343, 254, 58, 14);
		PanelDescripcion.add(lblCantidad);
		
		JButton btnAtrs_1 = new JButton("Atr\u00E1s");
		btnAtrs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs_1.setBounds(10, 368, 89, 23);
		PanelDescripcion.add(btnAtrs_1);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(miControlador.getModelo().getLogueo()){
					if(miControlador.consultarStock(miControlador.getModelo().getNumProducto(),comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString())){
						miControlador.getModelo().setTalleProducto(comboBox.getSelectedItem().toString());
						miControlador.getModelo().setCantidadProducto(comboBox_1.getSelectedItem().toString());
						actualizarPanelConfirmar(comboBox_1.getSelectedItem().toString());
						contentPane.removeAll();				
						contentPane.add(PanelConfirmar);
						contentPane.repaint();
						contentPane.revalidate();
					}
					else {
						JOptionPane.showMessageDialog(null, "Por el momento no contamos con el Stock suficiente");
					}
				}
				else{
					contentPane.removeAll();				
					contentPane.add(PanelNoIngreso);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnComprar.setBounds(359, 318, 179, 49);
		PanelDescripcion.add(btnComprar);
	}
	
	public void actualizarPanelConfirmar(String cantidad){
		PanelConfirmar.removeAll();
		
		JLabel lblUstedEstaPor = new JLabel("Usted esta por comprar :");
		lblUstedEstaPor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUstedEstaPor.setBounds(35, 36, 230, 30);
		PanelConfirmar.add(lblUstedEstaPor);
		
		JButton btnAtrs_4 = new JButton("Atr\u00E1s");
		btnAtrs_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs_4.setBounds(10, 368, 89, 23);
		PanelConfirmar.add(btnAtrs_4);
		
		JLabel lblIngreseSuN = new JLabel("Ingrese su N\u00BA de tarjeta de cr\u00E9dito :");
		lblIngreseSuN.setBounds(35, 212, 201, 14);
		PanelConfirmar.add(lblIngreseSuN);
		
		JLabel lblIngreseLaSucursal = new JLabel("Ingrese la sucursal OCA de destino :");
		lblIngreseLaSucursal.setBounds(35, 253, 208, 14);
		PanelConfirmar.add(lblIngreseLaSucursal);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(256, 209, 174, 20);
		PanelConfirmar.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Sucursal Centro (Cba)", "Sucursal Velez Sarsfield (Cba)", "Sucursal Rio Cuarto", "Sucursal Villa Maria"}));
		comboBox_8.setBounds(256, 250, 173, 20);
		PanelConfirmar.add(comboBox_8);
		
		JButton btnNewButton_3 = new JButton("Confirmar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numTarjeta = txtTarjeta.getText();
				if(miControlador.chequearTarjeta(numTarjeta)){
				miControlador.getModelo().actualizarBaseDeDatos(miControlador.getModelo().getNumProducto(), miControlador.getModelo().getTalleProducto(), miControlador.getModelo().getCantidadProducto());
		
				JOptionPane.showMessageDialog(null, "Felicidades!! Su producto estará llegando entre 15/20 días a la sucursal OCA");
				
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
				}
				else {
					JOptionPane.showMessageDialog(null, "Ingrese un numero de tarjeta valido");
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(407, 330, 140, 47);
		PanelConfirmar.add(btnNewButton_3);
		
		String variable1 = miControlador.getModelo().getProducto(miControlador.getModelo().getNumProducto()).getNombre();
		textField = new JTextField(variable1);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(35, 100, 375, 37);
		PanelConfirmar.add(textField);
		textField.setColumns(10);
		
		String variable2 = miControlador.getModelo().getProducto(miControlador.getModelo().getNumProducto()).getPrecio();
		String variable3 = variable2.substring(2);
		int i = Integer.parseInt(variable3) * Integer.parseInt(cantidad);
		variable2 = "$ " + Integer.toString(i);
		textField_1 = new JTextField(variable2);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_1.setBounds(461, 102, 86, 35);
		PanelConfirmar.add(textField_1);
		textField_1.setColumns(10);
		
	}
	
	public void setControlador(Controlador controlador){
		miControlador = controlador;
	}
	
	public Controlador getControlador(){
		return miControlador;
	}
	
	public JTable getTabla(){
		return table;
	}

	@Override
	public void update() {
		PanelAdmin.removeAll();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblControlDeInventario = new JLabel("Control de Inventario");
		lblControlDeInventario.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblTalle_1 = new JLabel("Talle");
		lblTalle_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnActualizarCantidad = new JButton("Actualizar\r\n cantidad");
		
		JComboBox comboProduct = new JComboBox();
		comboProduct.setModel(new DefaultComboBoxModel(new String[] {"", "Chelsea", "Liverpool", "City", "United"}));
		
		JComboBox comboSize = new JComboBox();
		comboSize.setModel(new DefaultComboBoxModel(new String[] {"", "S", "M", "L"}));
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		Cantidad = new JTextField();
		Cantidad.setColumns(10);
		
		JLabel lblCity = new JLabel("Chelsea");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblUnited = new JLabel("Liverpool");
		lblUnited.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblArsenal = new JLabel("City");
		lblArsenal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblLiverpool = new JLabel("United");
		lblLiverpool.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_4 = new JButton("Atr\u00E1s");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		GroupLayout gl_PanelAdmin = new GroupLayout(PanelAdmin);
		gl_PanelAdmin.setHorizontalGroup(
			gl_PanelAdmin.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PanelAdmin.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_4)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(lblControlDeInventario, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					.addGap(113))
				.addGroup(gl_PanelAdmin.createSequentialGroup()
					.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTalle_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(27))
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_PanelAdmin.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelAdmin.createSequentialGroup()
									.addContainerGap(43, Short.MAX_VALUE)
									.addComponent(lblCantidad_1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
								.addGroup(gl_PanelAdmin.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblUnited, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblArsenal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblLiverpool, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
										.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)))
					.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addComponent(scrollPane, 0, 0, Short.MAX_VALUE)
							.addGap(98))
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.LEADING)
								.addComponent(comboProduct, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(Cantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelAdmin.createSequentialGroup()
									.addComponent(comboSize, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(183)
									.addComponent(btnActualizarCantidad)))
							.addGap(67))))
		);
		gl_PanelAdmin.setVerticalGroup(
			gl_PanelAdmin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelAdmin.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addComponent(lblControlDeInventario, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addComponent(btnNewButton_4)
							.addGap(75)
							.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblUnited, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblArsenal, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLiverpool, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addComponent(comboProduct, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addGap(18)
							.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCantidad_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(Cantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(33))
						.addGroup(gl_PanelAdmin.createSequentialGroup()
							.addGroup(gl_PanelAdmin.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboSize, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTalle_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnActualizarCantidad, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
							.addGap(79))))
		);
		
		
		
		//DefaultTableModel modeloo = new DefaultTableModel();
		table = new JTable();  
		table.setRowHeight(30);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		String[] columnas = new String[] {"S", "M", "L"};
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{miControlador.getModelo().getBaseDeDatos().getUnStock(0,0), miControlador.getModelo().getBaseDeDatos().getUnStock(0,1), miControlador.getModelo().getBaseDeDatos().getUnStock(0,2)},
				{miControlador.getModelo().getBaseDeDatos().getUnStock(1,0), miControlador.getModelo().getBaseDeDatos().getUnStock(1,1), miControlador.getModelo().getBaseDeDatos().getUnStock(1,2)},
				{miControlador.getModelo().getBaseDeDatos().getUnStock(2,0), miControlador.getModelo().getBaseDeDatos().getUnStock(2,1), miControlador.getModelo().getBaseDeDatos().getUnStock(2,2)},
				{miControlador.getModelo().getBaseDeDatos().getUnStock(3,0), miControlador.getModelo().getBaseDeDatos().getUnStock(3,1), miControlador.getModelo().getBaseDeDatos().getUnStock(3,2)},
			},
			columnas) 
		{
			Class[] columnTypes = new Class[] {
			Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		PanelAdmin.setLayout(gl_PanelAdmin);
		//((DefaultTableModel) table.getModel()).setValueAt(valor, fila, columna);
		
		btnActualizarCantidad.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				int dif= Integer.parseInt(Cantidad.getText()); //aca habria q hacer testeo para q sea entero tal vez con un try catch
				String product = (String)comboProduct.getSelectedItem();
				String talle = (String)comboSize.getSelectedItem();
				int ncol = 0; //las tengo q inicializar si o si
				int nrow = 0;
				switch (product) {
		            case "Chelsea":  		nrow = 0;
		                     	break;
		            case "Liverpool":  	nrow = 1;
                 				break;
		            case "City": 	nrow = 2;
                 				break;
		            case "United":   nrow = 3;
                 				break;
				}
				switch (talle) {
	            case "S":  	ncol = 0;
	                     	break;
	            case "M":  	ncol = 1;
             				break;
	            case "L": 	ncol = 2;
             				break;
	            }
				miControlador.agregarStock(nrow, ncol, dif);
				table.setValueAt((Integer) dif, nrow, ncol); //test de si la columna es nula
			}
		});
		btnActualizarCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
	}
	
}
