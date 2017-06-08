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


public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JPanel PanelInicio;
	private JPanel AltaUsuario;
	private JPanel LogueoUsuario;
	private JPanel PanelCatalogo;
	private JPanel PanelChelsea;
	private JPanel PanelLiverpool;
	private JPanel PanelCity;
	private JPanel PanelUnited;
	private JPanel SobreNosotros;
	private JPanel PanelNoIngreso;
	private JPanel PanelConfirmar;
	public static JTextField textField;
	public static JTextField textField_2;
	public static JTextField txtTarjeta;
	public static JPasswordField passwordField;
	public static JPasswordField passwordField_1;
	public DatosUsuario data = new DatosUsuario();
	private boolean estaLogueado = false;
	private int tipoCamiseta;
	private String talleCamiseta;
	private String cantidadCamisetas;
	//private DatosStock stock;
	private DatosStock stock = new DatosStock();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setBounds(100, 100, 600, 450);
		//setBounds(100, 100, 985, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		////////////////////////////////////////// Panel Inicio /////////////////////////////////////////////////////////////////
		
		//JPanel PanelInicio = new JPanel();
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
		btnRegistrarse.setBounds(29, 123, 108, 172);
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
		btnVerCatlogo.setBounds(178, 123, 228, 172);
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
		btnSobreNosotros.setBounds(444, 123, 108, 172);
		PanelInicio.add(btnSobreNosotros);
		
		JButton btnSobreNosotros_1 = new JButton("Sobre nosotros");
		btnSobreNosotros_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(SobreNosotros);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnSobreNosotros_1.setBounds(10, 361, 127, 30);
		PanelInicio.add(btnSobreNosotros_1);
		
		////////////////////////////////////////// Alta usuario /////////////////////////////////////////////////////////////////
		
		//JPanel AltaUsuario = new JPanel();
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
		
		textField = new JTextField();
		textField.setBounds(180, 159, 223, 35);
		AltaUsuario.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxHeLeidoY = new JCheckBox("He leido y acepto los t\u00E9rminos y condiciones");
		chckbxHeLeidoY.setBounds(180, 289, 235, 23);
		AltaUsuario.add(chckbxHeLeidoY);
		
		JButton btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (data.agregarUsuario()==1){
			JOptionPane.showMessageDialog(null, "Felicitaciones, usted es un nuevo usuario de la página");
			estaLogueado = true;
			contentPane.removeAll();				
			contentPane.add(PanelCatalogo);
			contentPane.repaint();
			contentPane.revalidate();
			}
			else {
				JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está en uso");
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
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(180, 217, 223, 35);
		AltaUsuario.add(passwordField_1);
		
		////////////////////////////////////////// Logueo Usuario /////////////////////////////////////////////////////////////////
		
		//JPanel LogueoUsuario = new JPanel();
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
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 130, 223, 35);
		panel_7.add(textField_2);
		
		JCheckBox chckbxRecordar = new JCheckBox("Recordar");
		chckbxRecordar.setBounds(180, 266, 235, 23);
		panel_7.add(chckbxRecordar);
		
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.probarPass()==1){
				estaLogueado = true;
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 196, 223, 35);
		panel_7.add(passwordField);
		
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
				contentPane.removeAll();				
				contentPane.add(PanelChelsea);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setBounds(141, 144, 118, 32);
		PanelCatalogo.add(btnNewButton);
		
		JButton button = new JButton("Ver producto");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelLiverpool);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button.setBounds(402, 144, 109, 32);
		PanelCatalogo.add(button);
		
		JButton button_2 = new JButton("Ver producto");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCity);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_2.setBounds(141, 299, 118, 32);
		PanelCatalogo.add(button_2);
		
		JButton button_3 = new JButton("Ver producto");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelUnited);
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
				estaLogueado = false;
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs_2.setBounds(10, 368, 89, 23);
		PanelCatalogo.add(btnAtrs_2);

		////////////////////////////////////////// Panel Chelsea /////////////////////////////////////////////////////////////////
		
		//JPanel PanelChelsea = new JPanel();
		PanelChelsea = new JPanel();
		contentPane.add(PanelChelsea, "name_100525873856418");
		PanelChelsea.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 574, 402);
		PanelChelsea.add(panel_3);
		
		JLabel label5 = new JLabel("");
		Image img5 = new ImageIcon(getClass().getResource("camisetaa1.png")).getImage();
		label5.setIcon(new ImageIcon(img5));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(10, 67, 275, 300);
		panel_3.add(label5);
		
		JLabel label_4 = new JLabel("Camiseta Chelsea temporada 13/14");
		label_4.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		label_4.setBounds(23, 24, 515, 32);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("$ 1400");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 34));
		label_5.setBounds(343, 106, 132, 54);
		panel_3.add(label_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L"}));
		comboBox_2.setBounds(428, 200, 46, 20);
		panel_3.add(comboBox_2);
		
		JLabel label_6 = new JLabel("Talle");
		label_6.setBounds(343, 203, 46, 14);
		panel_3.add(label_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_3.setBounds(428, 251, 47, 20);
		panel_3.add(comboBox_3);
		
		JLabel label_7 = new JLabel("Cantidad");
		label_7.setBounds(343, 254, 60, 14);
		panel_3.add(label_7);
		
		JButton button_4 = new JButton("Atr\u00E1s");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_4.setBounds(10, 368, 89, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Comprar");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estaLogueado){
					tipoCamiseta = 1;
					talleCamiseta = comboBox_2.getSelectedItem().toString();
					cantidadCamisetas = comboBox_3.getSelectedItem().toString();
					contentPane.removeAll();				
					contentPane.add(PanelConfirmar);
					contentPane.repaint();
					contentPane.revalidate();
				}
				else{
					contentPane.removeAll();				
					contentPane.add(PanelNoIngreso);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.setBounds(359, 318, 179, 49);
		panel_3.add(button_5);

		////////////////////////////////////////// Panel Liverpool /////////////////////////////////////////////////////////////////
		
		//JPanel PanelLiverpool = new JPanel();
		PanelLiverpool = new JPanel();
		contentPane.add(PanelLiverpool, "name_100521368218582");
		PanelLiverpool.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 574, 402);
		PanelLiverpool.add(panel_4);
		
		JLabel label6 = new JLabel("");
		Image img6 = new ImageIcon(getClass().getResource("camisetab1.png")).getImage();
		label6.setIcon(new ImageIcon(img6));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(10, 67, 275, 300);
		panel_4.add(label6);
		
		JLabel label_8 = new JLabel("Camiseta Liverpool temporada 16/17");
		label_8.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		label_8.setBounds(23, 24, 515, 32);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("$ 1200");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 34));
		label_9.setBounds(343, 106, 132, 54);
		panel_4.add(label_9);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L"}));
		comboBox_4.setBounds(428, 200, 46, 20);
		panel_4.add(comboBox_4);
		
		JLabel label_10 = new JLabel("Talle");
		label_10.setBounds(343, 203, 46, 14);
		panel_4.add(label_10);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_5.setBounds(428, 251, 46, 20);
		panel_4.add(comboBox_5);
		
		JLabel label_11 = new JLabel("Cantidad");
		label_11.setBounds(343, 254, 64, 14);
		panel_4.add(label_11);
		
		JButton button_6 = new JButton("Atr\u00E1s");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_6.setBounds(10, 368, 89, 23);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("Comprar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estaLogueado){
					tipoCamiseta = 2;
					talleCamiseta = comboBox_4.getSelectedItem().toString();
					cantidadCamisetas = comboBox_5.getSelectedItem().toString();
					contentPane.removeAll();				
					contentPane.add(PanelConfirmar);
					contentPane.repaint();
					contentPane.revalidate();
				}
				else{
					contentPane.removeAll();				
					contentPane.add(PanelNoIngreso);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_7.setBounds(359, 318, 179, 49);
		panel_4.add(button_7);

		////////////////////////////////////////// Panel City /////////////////////////////////////////////////////////////////
		
		//JPanel PanelCity = new JPanel();
		PanelCity = new JPanel();
		contentPane.add(PanelCity, "name_100518894167850");
		PanelCity.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 574, 402);
		PanelCity.add(panel_5);
		
		JLabel label7 = new JLabel("");
		Image img7 = new ImageIcon(getClass().getResource("camisetac1.png")).getImage();
		label7.setIcon(new ImageIcon(img7));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setBounds(10, 67, 275, 300);
		panel_5.add(label7);
		
		JLabel label_13 = new JLabel("Camiseta Manchester City temp 15/16");
		label_13.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		label_13.setBounds(23, 24, 515, 32);
		panel_5.add(label_13);
		
		JLabel label_14 = new JLabel("$ 1300");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 34));
		label_14.setBounds(343, 106, 132, 54);
		panel_5.add(label_14);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L"}));
		comboBox_6.setBounds(428, 200, 46, 20);
		panel_5.add(comboBox_6);
		
		JLabel label_15 = new JLabel("Talle");
		label_15.setBounds(343, 203, 46, 14);
		panel_5.add(label_15);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_7.setBounds(428, 251, 46, 20);
		panel_5.add(comboBox_7);
		
		JLabel label_16 = new JLabel("Cantidad");
		label_16.setBounds(343, 254, 60, 14);
		panel_5.add(label_16);
		
		JButton button_8 = new JButton("Atr\u00E1s");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		button_8.setBounds(10, 368, 89, 23);
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("Comprar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estaLogueado){
					tipoCamiseta = 3;
					talleCamiseta = comboBox_6.getSelectedItem().toString();
					cantidadCamisetas = comboBox_7.getSelectedItem().toString();
					contentPane.removeAll();				
					contentPane.add(PanelConfirmar);
					contentPane.repaint();
					contentPane.revalidate();
				}
				else{
					contentPane.removeAll();				
					contentPane.add(PanelNoIngreso);
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_9.setBounds(359, 318, 179, 49);
		panel_5.add(button_9);

		////////////////////////////////////////// Panel United /////////////////////////////////////////////////////////////////
		
		//JPanel PanelUnited = new JPanel();
		PanelUnited = new JPanel();
		contentPane.add(PanelUnited, "name_100515180397487");
		PanelUnited.setLayout(null);
		
		JLabel label8 = new JLabel("");
		Image img8 = new ImageIcon(getClass().getResource("camisetad1.png")).getImage();
		label8.setIcon(new ImageIcon(img8));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setBounds(10, 67, 275, 300);
		PanelUnited.add(label8);
		
		JLabel lblNewLabel_1 = new JLabel("Camiseta Manchester United temp 16/17");
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(23, 24, 515, 32);
		PanelUnited.add(lblNewLabel_1);
		
		JLabel label = new JLabel("$ 1350");
		label.setFont(new Font("Tahoma", Font.PLAIN, 34));
		label.setBounds(343, 106, 132, 54);
		PanelUnited.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L"}));
		comboBox.setBounds(428, 200, 46, 20);
		PanelUnited.add(comboBox);
		
		JLabel lblTalle = new JLabel("Talle");
		lblTalle.setBounds(343, 203, 46, 14);
		PanelUnited.add(lblTalle);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1.setBounds(428, 251, 47, 20);
		PanelUnited.add(comboBox_1);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(343, 254, 58, 14);
		PanelUnited.add(lblCantidad);
		
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
		PanelUnited.add(btnAtrs_1);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estaLogueado){
					tipoCamiseta = 4;
					talleCamiseta = comboBox.getSelectedItem().toString();
					cantidadCamisetas = comboBox_1.getSelectedItem().toString();
					contentPane.removeAll();				
					contentPane.add(PanelConfirmar);
					contentPane.repaint();
					contentPane.revalidate();
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
		PanelUnited.add(btnComprar);

		////////////////////////////////////////// Panel sobre nosotros /////////////////////////////////////////////////////////////////
		
		//JPanel SobreNosotros = new JPanel();
		SobreNosotros = new JPanel();
		contentPane.add(SobreNosotros, "name_100511211089568");
		SobreNosotros.setLayout(null);
		
		JLabel lblSobreNosotros = new JLabel("Sobre nosotros...");
		lblSobreNosotros.setFont(new Font("Tekton Pro", Font.PLAIN, 28));
		lblSobreNosotros.setBounds(175, 28, 245, 34);
		SobreNosotros.add(lblSobreNosotros);
		
		JButton btnAtrs_3 = new JButton("Atr\u00E1s");
		btnAtrs_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();				
				contentPane.add(PanelInicio);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAtrs_3.setBounds(10, 368, 89, 23);
		SobreNosotros.add(btnAtrs_3);

		////////////////////////////////////////// Panel No ingreso/////////////////////////////////////////////////////////////////
		
		//JPanel PanelNoIngreso = new JPanel();
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
		
		//JPanel PanelConfirmar = new JPanel();
		PanelConfirmar = new JPanel();
		contentPane.add(PanelConfirmar, "name_100503184104587");
		PanelConfirmar.setLayout(null);
		
		JLabel lblUstedEstaPor = new JLabel("Usted esta por comprar :");
		lblUstedEstaPor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUstedEstaPor.setBounds(35, 36, 230, 30);
		PanelConfirmar.add(lblUstedEstaPor);
		
		JLabel label_3 = new JLabel("$");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_3.setBounds(425, 102, 46, 35);
		PanelConfirmar.add(label_3);
		
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
		lblIngreseSuN.setBounds(35, 212, 191, 14);
		PanelConfirmar.add(lblIngreseSuN);
		
		JLabel lblIngreseLaSucursal = new JLabel("Ingrese la sucursal OCA de destino :");
		lblIngreseLaSucursal.setBounds(35, 253, 191, 14);
		PanelConfirmar.add(lblIngreseLaSucursal);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(236, 209, 174, 20);
		PanelConfirmar.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Sucursal Centro (Cba)", "Sucursal Velez Sarsfield (Cba)", "Sucursal Rio Cuarto", "Sucursal Villa Maria"}));
		comboBox_8.setBounds(236, 250, 173, 20);
		PanelConfirmar.add(comboBox_8);
		
		JButton btnNewButton_3 = new JButton("Confirmar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidad1;
				int cantidad2 = 0;
				int cantidad3 = Integer.parseInt(cantidadCamisetas);
				switch (talleCamiseta){
				case "S":
					cantidad2 = 0;
				case "M":
					cantidad2 = 1;
				case "L":
					cantidad2 = 2;
				}
				cantidad1 = stock.getUnStock(tipoCamiseta-1, cantidad2);
				cantidad1 = cantidad1 - cantidad3;
				stock.setStock(tipoCamiseta-1, cantidad2, cantidad1);
				
				JOptionPane.showMessageDialog(null, "Felicidades!! Su producto estará llegando entre 15/20 días a la sucursal OCA");

				contentPane.removeAll();				
				contentPane.add(PanelCatalogo);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(407, 330, 140, 47);
		PanelConfirmar.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Camiseta Chelsea temporada 13/14");
		JLabel lblNewLabel_3 = new JLabel("1300");
		
		/*switch (tipoCamiseta){
		case 1:
			lblNewLabel_2.setText("Camiseta Chelsea temporada 13/14");
			lblNewLabel_3.setText("1300");
			break;
		case 2:
			lblNewLabel_2.setText("Camiseta Liverpool temporada 16/17");
			lblNewLabel_3.setText("1200");
			break;
		case 3:
			lblNewLabel_2.setText("Camiseta Man City temp 15/16");
			lblNewLabel_3.setText("1400");
			break;
		case 4:
			lblNewLabel_2.setText("Camiseta Man United temp 13/14");
			lblNewLabel_3.setText("1350");
			break;
		  }*/
		
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(35, 98, 380, 47);
		PanelConfirmar.add(lblNewLabel_2);
		
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(448, 108, 85, 27);
		PanelConfirmar.add(lblNewLabel_3);
	}
}
