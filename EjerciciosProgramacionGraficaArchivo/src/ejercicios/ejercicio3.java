package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroupCalculadora = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3 frame = new ejercicio3();
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
	public ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel jLabelNum1 = new JLabel("Introduce el número 1");
		jLabelNum1.setBounds(12, 7, 155, 15);
		panel.add(jLabelNum1);
		
		textField = new JTextField();
		textField.setBounds(175, 5, 68, 19);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel jLabelNum2 = new JLabel("Introduce el número 2");
		jLabelNum2.setBounds(285, 7, 155, 15);
		panel.add(jLabelNum2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(447, 5, 68, 19);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JRadioButton radioButonSumatorio = new JRadioButton("Sumatorio");
		buttonGroupCalculadora.add(radioButonSumatorio);
		radioButonSumatorio.setBounds(30, 42, 149, 23);
		panel.add(radioButonSumatorio);
		
		JRadioButton radioButonProductorio = new JRadioButton("Productorio");
		buttonGroupCalculadora.add(radioButonProductorio);
		radioButonProductorio.setBounds(191, 42, 135, 23);
		panel.add(radioButonProductorio);
		
		JRadioButton radioButonExponencial = new JRadioButton("Exponencial");
		buttonGroupCalculadora.add(radioButonExponencial);
		radioButonExponencial.setBounds(366, 42, 149, 23);
		panel.add(radioButonExponencial);
	}
}
