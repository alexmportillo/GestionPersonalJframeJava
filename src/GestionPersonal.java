import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SpinnerDateModel;
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
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class GestionPersonal {

	private JFrame frame;
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField comment;
	private JLabel labelSueldo;
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
		
		nombre = new JTextField();
		nombre.setBounds(106, 36, 86, 20);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		apellidos = new JTextField();
		apellidos.setColumns(10);
		apellidos.setBounds(106, 67, 86, 20);
		frame.getContentPane().add(apellidos);
		
		comment = new JTextField();
		comment.setColumns(10);
		comment.setBounds(338, 255, 213, 109);
		frame.getContentPane().add(comment);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 39, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(30, 70, 66, 14);
		frame.getContentPane().add(lblApellidos);
		
		JRadioButton hombre = new JRadioButton("Hombre");
		hombre.setBounds(30, 105, 88, 23);
		frame.getContentPane().add(hombre);
		
		JRadioButton mujer = new JRadioButton("Mujer");
		mujer.setBounds(139, 105, 71, 23);
		frame.getContentPane().add(mujer);
		
		
		
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
		lblNewLabel.setBounds(264, 105, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(338, 236, 80, 14);
		frame.getContentPane().add(lblComentarios);
		
		JButton crearBut = new JButton("Crear");
		crearBut.setBackground(SystemColor.inactiveCaption);
		crearBut.setBounds(82, 304, 151, 43);
		frame.getContentPane().add(crearBut);
		
		JLabel lblAntigedad = new JLabel("Antig\u00FCedad");
		lblAntigedad.setBounds(47, 259, 71, 14);
		frame.getContentPane().add(lblAntigedad);
		
		JButton btnEstaDeVacaciones = new JButton("Esta de Vacaciones");
		btnEstaDeVacaciones.setBackground(SystemColor.activeCaption);
		btnEstaDeVacaciones.setEnabled(false);
		btnEstaDeVacaciones.setBounds(341, 38, 185, 47);
		frame.getContentPane().add(btnEstaDeVacaciones);
		
		
		
		JLabel lsueldo = new JLabel("\u20AC al mes");
		lsueldo.setBounds(384, 149, 94, 14);
		frame.getContentPane().add(lsueldo);
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
		lsueldo.setText(slider.getValue()+"€ al mes");
			}
		});
		slider.setBounds(351, 105, 200, 23);
		frame.getContentPane().add(slider);
		
		JSpinner spinner = new JSpinner(new SpinnerDateModel());
		spinner.setBounds(116, 255, 117, 20);
		frame.getContentPane().add(spinner);
		SimpleDateFormat model = new SimpleDateFormat("dd/MM/yy");
		spinner.setEditor(new JSpinner.DateEditor(spinner, model.toPattern()));
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);
		
		JMenu mnModo = new JMenu("Modo");
		menuBar.add(mnModo);
		
		JMenuItem mntmModoCrear = new JMenuItem("Modo Crear");
		mntmModoCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre.setEnabled(true);
				apellidos.setEnabled(true);
				hombre.setEnabled(true);
				mujer.setEnabled(true);
				list.setEnabled(true);
				crearBut.setEnabled(true);
				comment.setEnabled(true);
				
				slider.setEnabled(true);
			}
		});
		mnModo.add(mntmModoCrear);
		
		JMenuItem mntmModoLeer = new JMenuItem("Modo Leer");
		mntmModoLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nombre.setEnabled(false);
				apellidos.setEnabled(false);
				hombre.setEnabled(false);
				mujer.setEnabled(false);
				list.setEnabled(false);
				crearBut.setEnabled(false);
				comment.setEnabled(false);
				
				slider.setEnabled(false);
				
			}
		});
		mnModo.add(mntmModoLeer);
		
		JMenu mnNewMenu = new JMenu("Ayuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit( 0 ); 
			}
		});
		mnNewMenu.add(mntmSalir);
	}
}
