package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JLabel jLabelDado6;
	private JLabel jLabelDado8;
	private JLabel jLabelDado10;
	private JLabel jLabelDado12;
	private JLabel jLabelDado20;
	private JButton jButtonDado6;
	private JButton jButtonDado8;
	private JButton jButtonDado10;
	private JButton jButtonDado12;
	private JButton jButtonDado20;	
	private JLabel jLableResultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio6 frame = new ejercicio6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void girarDado(ActionEvent e) {
		
		int num=0;
		
		if (jButtonDado6.hasFocus()) {
			num = 6; 
		}else if (jButtonDado8.hasFocus()) {
			num= 8;
		}else if (jButtonDado10.hasFocus()) {
			num= 10;
		}else if (jButtonDado12.hasFocus()) {
			num= 12;
		}else if (jButtonDado20.hasFocus()) {
			num= 20;
		}
		
		int resultado = (int) (Math.random()*(num+1-1)+1);
		
		jLableResultado.setText("El numero del dado que ha salido es el " + resultado);
	}
	

	/**
	 * Create the frame.
	 */
	public ejercicio6() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		jLabelDado6 = new JLabel("Dado 6 caras");
		jLabelDado6.setBounds(28, 12, 102, 27);
		panel.add(jLabelDado6);
		
		jLabelDado8 = new JLabel("Dado 8 caras");
		jLabelDado8.setBounds(142, 12, 102, 27);
		panel.add(jLabelDado8);
		
		jLabelDado10 = new JLabel("Dado 10 caras");
		jLabelDado10.setBounds(256, 12, 102, 27);
		panel.add(jLabelDado10);
		
		jLabelDado12 = new JLabel("Dado 12 caras");
		jLabelDado12.setBounds(370, 12, 102, 27);
		panel.add(jLabelDado12);
		
		jLabelDado20 = new JLabel("Dado 20 caras");
		jLabelDado20.setBounds(488, 12, 102, 27);
		panel.add(jLabelDado20);
		
				
		jButtonDado6 = new JButton("GIRAR");
		jButtonDado6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girarDado(e);
			}
		});
		jButtonDado6.setBounds(28, 50, 102, 49);
		panel.add(jButtonDado6);
		
		jButtonDado8 = new JButton("GIRAR");
		jButtonDado8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girarDado(e);
			}
		});
		jButtonDado8.setBounds(142, 51, 102, 49);
		panel.add(jButtonDado8);
		
		jButtonDado10 = new JButton("GIRAR");
		jButtonDado10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girarDado(e);
			}
		});
		jButtonDado10.setBounds(256, 51, 102, 49);
		panel.add(jButtonDado10);
		
		jButtonDado12 = new JButton("GIRAR");
		jButtonDado12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girarDado(e);
			}
		});
		jButtonDado12.setBounds(370, 50, 102, 49);
		panel.add(jButtonDado12);
		
		jButtonDado20 = new JButton("GIRAR");
		jButtonDado20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girarDado(e);
			}
		});
		jButtonDado20.setBounds(488, 51, 102, 49);
		panel.add(jButtonDado20);
		
		jLableResultado = new JLabel("");
		jLableResultado.setBounds(128, 156, 430, 38);
		panel.add(jLableResultado);
	}
}
