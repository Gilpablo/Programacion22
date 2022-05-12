import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaClientes extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldId;
	private JTextField jTextFieldNombre;
	private JTextField jTextFieldDireccion;
	private JButton jButtonNuevo;
	private JButton jButtonEditar;
	private JButton jButtonBorrar;
	private JButton jButtonAceptar;
	private JButton jButtonCancelar;
	private static ArrayList<String> vClientes;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//BDClientes.ConectaBD();
		vClientes = BDClientes.cargarDatos();
		
		System.out.println(vClientes);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaClientes frame = new VentanaClientes();
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
	public VentanaClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel jLabelTitulo = new JLabel("Gestor de clientes");
		jLabelTitulo.setFont(new Font("Dialog", Font.BOLD, 27));
		jLabelTitulo.setBounds(209, 28, 319, 47);
		panel.add(jLabelTitulo);
		
		jButtonNuevo = new JButton("Nuevo");
		jButtonNuevo.setBounds(305, 119, 92, 25);
		panel.add(jButtonNuevo);
		
		jButtonEditar = new JButton("Editar");
		jButtonEditar.setBounds(436, 119, 92, 25);
		panel.add(jButtonEditar);
		
		jButtonBorrar = new JButton("Borrar");
		jButtonBorrar.setBounds(564, 119, 92, 25);
		panel.add(jButtonBorrar);
		
		JLabel jLabelId = new JLabel("id:");
		jLabelId.setBounds(25, 191, 46, 15);
		panel.add(jLabelId);
		
		jTextFieldId = new JTextField();
		jTextFieldId.setBounds(57, 186, 77, 25);
		panel.add(jTextFieldId);
		jTextFieldId.setColumns(10);
		
		JLabel jLabelNombre = new JLabel("Nombre:");
		jLabelNombre.setBounds(171, 191, 77, 15);
		panel.add(jLabelNombre);
		
		jTextFieldNombre = new JTextField();
		jTextFieldNombre.setColumns(10);
		jTextFieldNombre.setBounds(253, 186, 403, 25);
		panel.add(jTextFieldNombre);
		
		JLabel jLabelDireccion = new JLabel("Direccion:");
		jLabelDireccion.setBounds(25, 264, 90, 15);
		panel.add(jLabelDireccion);
		
		jTextFieldDireccion = new JTextField();
		jTextFieldDireccion.setColumns(10);
		jTextFieldDireccion.setBounds(116, 262, 540, 25);
		panel.add(jTextFieldDireccion);
		
		jButtonAceptar = new JButton("Aceptar");
		jButtonAceptar.setBounds(247, 358, 117, 25);
		panel.add(jButtonAceptar);
		
		jButtonCancelar = new JButton("Cancelar");
		jButtonCancelar.setBounds(394, 358, 117, 25);
		panel.add(jButtonCancelar);
		
		
		String id = vClientes.get(0);
		String nombre = vClientes.get(1);
		String direccion = vClientes.get(2);
		
		jTextFieldId.setText(id);
		jTextFieldNombre.setText(nombre);
		jTextFieldDireccion.setText(direccion);
	}
}
