package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ejercicio9 extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldNombreDeUsuario;
	private JPasswordField jPasswordContra;
	private JButton jButtonIniciarSesion;
	private JButton jButtonCrearCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio9 frame = new ejercicio9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void tomarFocusNombreUsu (MouseEvent e) {
		
		if (jTextFieldNombreDeUsuario.getText().equals("Nombre de Usuario")) {
			jTextFieldNombreDeUsuario.setText("");
		}
		
	
	}
	
	private void tomarFocusPass (MouseEvent e) {
		
		
		jPasswordContra.setText("");
	}
	
	private void perderFocoNombreUsu (FocusEvent e) {
				
		if (jTextFieldNombreDeUsuario.getText().equalsIgnoreCase("")) {
			jTextFieldNombreDeUsuario.setText("Nombre de Usuario");
		}
		
	}
	
	private void mostrarPanel(ActionEvent e) {
		
		String nombreUsu = jTextFieldNombreDeUsuario.getText();
		char[] arrayContra = jPasswordContra.getPassword();
		String pass = new String(arrayContra);
		
		JOptionPane.showMessageDialog(this, nombreUsu + " y " + pass);
	}

	/**
	 * Create the frame.
	 */
	public ejercicio9() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		jTextFieldNombreDeUsuario = new JTextField();
		jTextFieldNombreDeUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				perderFocoNombreUsu(e);
				
			}
		});
		jTextFieldNombreDeUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tomarFocusNombreUsu(e);
			}
		});
		jTextFieldNombreDeUsuario.setBounds(155, 64, 129, 35);
		jTextFieldNombreDeUsuario.setText("Nombre de Usuario");
		panel.add(jTextFieldNombreDeUsuario);
		jTextFieldNombreDeUsuario.setColumns(10);
		
		
		
		jPasswordContra = new JPasswordField("Contraseña");
		
		jPasswordContra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tomarFocusPass(e);
			}
		});
		jPasswordContra.setBounds(155, 111, 129, 25);
		panel.add(jPasswordContra);
		
		jButtonIniciarSesion = new JButton("Iniciar Sesion");
		jButtonIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPanel(e);
			}
		});
		jButtonIniciarSesion.setBounds(155, 148, 129, 25);
		panel.add(jButtonIniciarSesion);
		
		jButtonCrearCuenta = new JButton("Crear Cuenta");
		jButtonCrearCuenta.setBounds(155, 196, 128, 25);
		panel.add(jButtonCrearCuenta);
		
		JLabel jLabelEjercicioIniciarSesion = new JLabel("Ejercicio Iniciar Sesion");
		jLabelEjercicioIniciarSesion.setBounds(138, 12, 166, 25);
		panel.add(jLabelEjercicioIniciarSesion);
	}
}
