import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton jButtonClientes;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void clientes(ActionEvent e) {
		
		VentanaClientes vc = new VentanaClientes();
		vc.setVisible(true);
		this.dispose();
		
	}
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblBienvenidosADaw = new JLabel("BIENVENIDOS A DAW HOTEL");
		lblBienvenidosADaw.setBounds(184, 12, 230, 53);
		panel.add(lblBienvenidosADaw);
		
		jButtonClientes = new JButton("CLIENTES");
		jButtonClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientes(e);
			}
		});
		jButtonClientes.setBounds(60, 84, 117, 25);
		panel.add(jButtonClientes);
	}
}
