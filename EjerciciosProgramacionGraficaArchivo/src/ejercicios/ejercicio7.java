package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JProgressBar jProgressBarProcesador;
	private JProgressBar jProgressBarRam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio7 frame = new ejercicio7();
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
	public ejercicio7() {
			
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		jProgressBarProcesador = new JProgressBar();
		jProgressBarProcesador.setBounds(48, 41, 148, 14);
		panel.add(jProgressBarProcesador);
		
		
		jProgressBarRam = new JProgressBar();
		jProgressBarRam.setBounds(231, 41, 148, 14);
		panel.add(jProgressBarRam);
		
		
		JLabel jLabelCpu = new JLabel("CPU");
		jLabelCpu.setBounds(100, 12, 70, 15);
		panel.add(jLabelCpu);
		
		JLabel jLabelRam = new JLabel("RAM");
		jLabelRam.setBounds(279, 14, 70, 15);
		panel.add(jLabelRam);
	}
}
