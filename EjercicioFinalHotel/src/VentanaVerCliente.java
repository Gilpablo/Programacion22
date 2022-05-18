import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaVerCliente extends JFrame {

	private JPanel contentPane;
	private JButton jButtonVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVerCliente frame = new VentanaVerCliente();
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

	/**
	 * Create the frame.
	 */
	public VentanaVerCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblVerClientes = new JLabel("VER LISTADO CLIENTES");
		lblVerClientes.setBounds(147, 12, 170, 28);
		panel.add(lblVerClientes);
		
		jButtonVolver = new JButton("Volver");
		jButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(e);
			}
		});
		jButtonVolver.setBounds(165, 189, 100, 25);
		panel.add(jButtonVolver);
	}

}
