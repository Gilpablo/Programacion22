import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaClientes extends JFrame {

	private JPanel contentPane;
	private JButton jButtonInsertar;
	private JButton jButtonEditar;
	private JButton jButtonVer;
	private JButton jButtonBorrar;
	private JButton jButtonVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	
	private void insertar(ActionEvent e) {
		
		VentanaInsertarCliente vic = new VentanaInsertarCliente();
		vic.setVisible(true);
		this.dispose();
		
	}
	
	private void editar(ActionEvent e) {
			
			VentanaEditarCliente vec = new VentanaEditarCliente();
			vec.setVisible(true);
			this.dispose();
			
		}
	
	private void ver(ActionEvent e) {
		
		VentanaVerCliente vvc = new VentanaVerCliente();
		vvc.setVisible(true);
		this.dispose();
		
	}
	
	private void borrar(ActionEvent e) {
		
		VentanaBorrarCliente vbc = new VentanaBorrarCliente();
		vbc.setVisible(true);
		this.dispose();
		
	}
	
	
	private void volver(ActionEvent e) {
		VentanaPrincipal vp = new VentanaPrincipal();
		vp.setVisible(true);
		this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	public VentanaClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblVentanaClientes = new JLabel("VENTANA CLIENTES");
		lblVentanaClientes.setBounds(187, 12, 155, 34);
		panel.add(lblVentanaClientes);
		
		jButtonInsertar = new JButton("INSERTAR CLIENTE");
		jButtonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertar(e);
			}
		});
		jButtonInsertar.setBounds(50, 75, 172, 25);
		panel.add(jButtonInsertar);
		
		jButtonEditar = new JButton("EDITAR CLIENTE");
		jButtonEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editar(e);
			}
		});
		jButtonEditar.setBounds(286, 75, 161, 25);
		panel.add(jButtonEditar);
		
		jButtonVer = new JButton("VER LISTADO");
		jButtonVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ver(e);
			}
		});
		jButtonVer.setBounds(50, 164, 172, 25);
		panel.add(jButtonVer);
		
		jButtonBorrar = new JButton("BORRAR CLIENTE");
		jButtonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar(e);
			}
		});
		jButtonBorrar.setBounds(286, 164, 161, 25);
		panel.add(jButtonBorrar);
		
		jButtonVolver = new JButton("Volver");
		jButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(e);
			}
		});
		jButtonVolver.setBounds(203, 239, 100, 25);
		panel.add(jButtonVolver);
	}

}
