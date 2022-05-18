import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaInsertarCliente extends JFrame {

	private JPanel contentPane;
	private JButton jButtonVolver;
	private JTextField jTextFieldNombre;
	private JTextField jTextFieldApellido1;
	private JTextField jTextFieldApellido2;
	private JTextField jTextFieldDireccion;
	private JTextField jTextFieldTelefono;
	private JTextField jTextFieldObservaciones;
	private JTextField jTextFieldPais;
	private JButton jButtonAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInsertarCliente frame = new VentanaInsertarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private void volver(ActionEvent e) {
		VentanaClientes vc = new VentanaClientes();
		vc.setVisible(true);
		this.dispose();
	}
	
	private void aceptarCliente(ActionEvent e) {
		
		
		
		conectarBD.insertarClientes();
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public VentanaInsertarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblInsertarClientes = new JLabel("INSERTAR CLIENTES");
		lblInsertarClientes.setBounds(222, 12, 152, 28);
		panel.add(lblInsertarClientes);
		
		jButtonVolver = new JButton("Volver");
		jButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(e);
			}
		});
		jButtonVolver.setBounds(330, 328, 100, 25);
		panel.add(jButtonVolver);
		
		JLabel jLabelNombre = new JLabel("Nombre:");
		jLabelNombre.setBounds(52, 54, 92, 15);
		panel.add(jLabelNombre);
		
		jTextFieldNombre = new JTextField();
		jTextFieldNombre.setBounds(181, 52, 296, 19);
		panel.add(jTextFieldNombre);
		jTextFieldNombre.setColumns(10);
		
		JLabel jLabelApellido1 = new JLabel("Apellido1:");
		jLabelApellido1.setBounds(52, 92, 80, 15);
		panel.add(jLabelApellido1);
		
		JLabel jLabelApellido2 = new JLabel("Apellido2:");
		jLabelApellido2.setBounds(52, 133, 80, 15);
		panel.add(jLabelApellido2);
		
		jTextFieldApellido1 = new JTextField();
		jTextFieldApellido1.setBounds(181, 90, 296, 19);
		panel.add(jTextFieldApellido1);
		jTextFieldApellido1.setColumns(10);
		
		jTextFieldApellido2 = new JTextField();
		jTextFieldApellido2.setColumns(10);
		jTextFieldApellido2.setBounds(181, 131, 296, 19);
		panel.add(jTextFieldApellido2);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(52, 171, 80, 15);
		panel.add(lblDireccion);
		
		jTextFieldDireccion = new JTextField();
		jTextFieldDireccion.setBounds(181, 169, 296, 19);
		panel.add(jTextFieldDireccion);
		jTextFieldDireccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Teléfono:");
		lblNewLabel.setBounds(52, 209, 80, 15);
		panel.add(lblNewLabel);
		
		jTextFieldTelefono = new JTextField();
		jTextFieldTelefono.setColumns(10);
		jTextFieldTelefono.setBounds(181, 207, 296, 19);
		panel.add(jTextFieldTelefono);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(52, 243, 132, 15);
		panel.add(lblObservaciones);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(52, 278, 70, 15);
		panel.add(lblPais);
		
		jTextFieldObservaciones = new JTextField();
		jTextFieldObservaciones.setColumns(10);
		jTextFieldObservaciones.setBounds(181, 241, 296, 19);
		panel.add(jTextFieldObservaciones);
		
		jTextFieldPais = new JTextField();
		jTextFieldPais.setColumns(10);
		jTextFieldPais.setBounds(181, 276, 296, 19);
		panel.add(jTextFieldPais);
		
		jButtonAceptar = new JButton("Aceptar");
		jButtonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptarCliente(e);
			}
		});
		jButtonAceptar.setBounds(181, 328, 100, 25);
		panel.add(jButtonAceptar);
	}
}
