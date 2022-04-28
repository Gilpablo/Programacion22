package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldIntroducir;
	private JLabel jLabelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void mostrarParImpar (ActionEvent e) {
		
		int num =  Integer.parseInt(jTextFieldIntroducir.getText());
		
		String resultado;
		
		if (num%2==0) {
			resultado = "par";
		}else {
			resultado = "impar";
		}
		
		jLabelResultado.setText("El número " + num +" es " + resultado);
		
	}

	/**
	 * Create the frame.
	 */
	public ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		jLabelResultado = new JLabel("Aqui mostrará si es par o impar");
		jLabelResultado.setBounds(124, 90, 222, 15);
		panel.add(jLabelResultado);
		
		
		JButton jButtonParImpar = new JButton("¿Par o impar?");
		jButtonParImpar.setBounds(309, 35, 129, 25);
		panel.add(jButtonParImpar);
		
		jTextFieldIntroducir = new JTextField();
		jTextFieldIntroducir.setBounds(198, 38, 88, 19);
		panel.add(jTextFieldIntroducir);
		jTextFieldIntroducir.setColumns(10);
		
		JLabel jLabelNum = new JLabel("Introduce un número");
		jLabelNum.setBounds(28, 40, 168, 15);
		panel.add(jLabelNum);
		jButtonParImpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarParImpar(e);
			}
		});
		
	}
}
