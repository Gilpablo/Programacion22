package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio4 frame = new ejercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void verificarDNI (ActionEvent e) {
		
	}
	

	/**
	 * Create the frame.
	 */
	public ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel jLabelIntroduccir = new JLabel("Introduce un DNI y te dire si es valido");
		jLabelIntroduccir.setBounds(195, 32, 281, 22);
		panel.add(jLabelIntroduccir);
		
		jTextFieldDNI = new JTextField();
		jTextFieldDNI.setBounds(255, 66, 140, 29);
		panel.add(jTextFieldDNI);
		jTextFieldDNI.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVerificar.setBounds(276, 107, 99, 25);
		panel.add(btnVerificar);
	}
}
