package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.management.ValueExp;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JSlider jSliderNumero;
	private JLabel jLabelSlider;
	private JLabel jLabelResultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio5 frame = new ejercicio5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void numeroSlider(MouseEvent e) {
		
		jLabelSlider.setText("" + jSliderNumero.getValue());
		
	}
	
	private void calcularAleatorio(ActionEvent e) {
		
		int num = jSliderNumero.getValue();
		
		double resul = Math.random()*num;
		
		jLabelResultado.setText("" + resul);
		
	}
	

	/**
	 * Create the frame.
	 */
	public ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		jSliderNumero = new JSlider();
		jSliderNumero.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				numeroSlider(e);
			}
		});
		panel.add(jSliderNumero);
		
		jLabelSlider = new JLabel();
		panel.add(jLabelSlider);
		jLabelSlider.setText("" + jSliderNumero.getValue());
		
		JButton jButtonNumero = new JButton("Número Aleatorio");
		jButtonNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularAleatorio(e);
			}
		});
		panel.add(jButtonNumero);
		
		jLabelResultado = new JLabel("Aqui irá el numero aleatorio");
		panel.add(jLabelResultado);
	}
}
