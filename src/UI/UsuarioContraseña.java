package UI;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioContraseña {

	private JFrame frame;
	private JTextField txtUser;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioContraseña window = new UsuarioContraseña();
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
	public UsuarioContraseña() {
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
		
		txtUser = new JTextField();
		txtUser.setBounds(212, 65, 115, 20);
		frame.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBounds(71, 64, 72, 17);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContrasea.setBounds(71, 124, 115, 17);
		frame.getContentPane().add(lblContrasea);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char clave[]=pass.getPassword();

				String clavedef=new String(clave);


				if (txtUser.getText().equals("Admin") && clavedef.equals("12345")){

				                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
				                    + "Usuario y Contraseña Correctos",   "Bienvenid@",
				                    JOptionPane.INFORMATION_MESSAGE);


				                    GestionPersonal GestionPersonal1 = new GestionPersonal();

				                    GestionPersonal1.frame2.setVisible(true);
				                  	frame.dispose();

				            }else {


				                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
				                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
				                    JOptionPane.ERROR_MESSAGE);
				           

				            }
			}
		});
		btnIngresar.setBounds(157, 187, 123, 48);
		frame.getContentPane().add(btnIngresar);
		
		
		pass = new JPasswordField();
		pass.setBounds(212, 125, 115, 20);
		frame.getContentPane().add(pass);
	}
}
