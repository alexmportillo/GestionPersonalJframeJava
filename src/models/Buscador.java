package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

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
		
		JCheckBox checkNombre = new JCheckBox("Nombre");
		checkNombre.setBounds(31, 38, 88, 23);
		frame.getContentPane().add(checkNombre);
		
		JCheckBox checkSueldo = new JCheckBox("Sueldo");
		checkSueldo.setBounds(121, 38, 79, 23);
		frame.getContentPane().add(checkSueldo);
		
		JCheckBox checkPuesto = new JCheckBox("Puesto");
		checkPuesto.setBounds(202, 38, 69, 23);
		frame.getContentPane().add(checkPuesto);
		
		JCheckBox checkAntig = new JCheckBox("Antig\u00FCedad");
		checkAntig.setBounds(290, 38, 96, 23);
		frame.getContentPane().add(checkAntig);
		
		textField = new JTextField();
		textField.setBounds(97, 77, 218, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(160, 125, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setIcon(null);
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscar.setBounds(10, 0, 109, 31);
		frame.getContentPane().add(lblBuscar);
	}
}
