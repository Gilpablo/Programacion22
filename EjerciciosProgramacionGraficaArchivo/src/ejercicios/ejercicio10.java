package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ejercicio10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio10 frame = new ejercicio10();
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
	public ejercicio10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 31, 440, 236);
		panel.add(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 440, 21);
		panel.add(menuBar);
		
		JMenu jMenuArchivo = new JMenu("Archivo");
		menuBar.add(jMenuArchivo);
		
		JMenuItem jMenuItemAbrir = new JMenuItem("Abrir");
		jMenuArchivo.add(jMenuItemAbrir);
		
		JMenuItem jMenuItemGuardar = new JMenuItem("Guardar");
		jMenuArchivo.add(jMenuItemGuardar);
		
		JMenu jMenuSize = new JMenu("Size");
		menuBar.add(jMenuSize);
	}
}
