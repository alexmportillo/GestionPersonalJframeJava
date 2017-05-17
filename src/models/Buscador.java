package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Buscador {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscador window = new Buscador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buscador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNombre = new JCheckBox("Nombre");
		chckbxNombre.setBounds(26, 7, 88, 23);
		frame.getContentPane().add(chckbxNombre);
		
		JCheckBox chckbxPuesto = new JCheckBox("Sueldo");
		chckbxPuesto.setBounds(116, 7, 79, 23);
		frame.getContentPane().add(chckbxPuesto);
		
		JCheckBox chckbxPuesto_1 = new JCheckBox("Puesto");
		chckbxPuesto_1.setBounds(197, 7, 69, 23);
		frame.getContentPane().add(chckbxPuesto_1);
		
		JCheckBox chckbxAntigedad = new JCheckBox("Antig\u00FCedad");
		chckbxAntigedad.setBounds(285, 7, 96, 23);
		frame.getContentPane().add(chckbxAntigedad);
		
		textField = new JTextField();
		textField.setBounds(92, 46, 218, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(155, 94, 89, 23);
		frame.getContentPane().add(btnBuscar);
	}
}
