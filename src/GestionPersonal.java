import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class GestionPersonal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionPersonal window = new GestionPersonal();
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
	public GestionPersonal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 599, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGestinDePersonal = new JLabel("Gesti\u00F3n de Personal  - Modo Crear");
		lblGestinDePersonal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestinDePersonal.setBounds(10, 11, 249, 14);
		frame.getContentPane().add(lblGestinDePersonal);
		
		textField = new JTextField();
		textField.setBounds(106, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 67, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(338, 255, 213, 109);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 39, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(30, 70, 66, 14);
		frame.getContentPane().add(lblApellidos);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(30, 105, 88, 23);
		frame.getContentPane().add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(139, 105, 71, 23);
		frame.getContentPane().add(rdbtnMujer);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10000);
		slider.setPaintTicks(true);
		slider.setBounds(403, 94, 123, 23);
		frame.getContentPane().add(slider);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jefe supremo", "Currante", "Programador", "Becario"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(165, 148, 103, 73);
		frame.getContentPane().add(list);
		
		JLabel lblPuestoEnLa = new JLabel("Puesto en la empresa");
		lblPuestoEnLa.setBounds(30, 149, 151, 14);
		frame.getContentPane().add(lblPuestoEnLa);
		
		JLabel lblNewLabel = new JLabel("Sueldo (0-10000)");
		lblNewLabel.setBounds(290, 97, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(338, 236, 80, 14);
		frame.getContentPane().add(lblComentarios);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBackground(SystemColor.inactiveCaption);
		btnCrear.setBounds(82, 304, 151, 43);
		frame.getContentPane().add(btnCrear);
		
		JLabel lblAntigedad = new JLabel("Antig\u00FCedad");
		lblAntigedad.setBounds(47, 259, 71, 14);
		frame.getContentPane().add(lblAntigedad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 255, 105, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("50 \u20AC al mes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(413, 136, 105, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEstaDeVacaciones = new JButton("Esta de Vacaciones");
		btnEstaDeVacaciones.setBackground(SystemColor.activeCaption);
		btnEstaDeVacaciones.setEnabled(false);
		btnEstaDeVacaciones.setBounds(341, 38, 185, 47);
		frame.getContentPane().add(btnEstaDeVacaciones);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);
		
		JMenu mnModo = new JMenu("Modo");
		menuBar.add(mnModo);
		
		JMenuItem mntmModoCrear = new JMenuItem("Modo Crear");
		mnModo.add(mntmModoCrear);
		
		JMenuItem mntmModoLeer = new JMenuItem("Modo Leer");
		mnModo.add(mntmModoLeer);
		
		JMenu mnNewMenu = new JMenu("Ayuda");
		menuBar.add(mnNewMenu);
	}
}
