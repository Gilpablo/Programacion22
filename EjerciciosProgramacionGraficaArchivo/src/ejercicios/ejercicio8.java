package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio8 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton jButtonMostrarDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio8 frame = new ejercicio8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	

	private void mostrarTabla(ActionEvent e) {
		
		int num =0;
	    int[] numbers = new int[100];
	    int cont=0;
	    for (int i = 1; i < 11; i++) {
	    	for (int j = 1; j < 11; j++) {
	    		num = i*j;
	    		
	    		numbers[cont] = num;
	    		
	    		cont = cont + 1;	
	    	}  
	    }
	    
	    int fila = 0;
	    int columna = 0;
	    int cont2 =0;
	    
	    
	    for (int i = 0; i < 10; i++) {
	    	table.setValueAt(numbers[i], fila, columna+cont2);
	    	cont2 = cont2 +  1;
		}
	    
	
	}
	
	/**
	 * Create the frame.
	 */
	public ejercicio8() {
			
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTabla = new JLabel("tabla");
		lblTabla.setBounds(200, 27, 141, 29);
		panel.add(lblTabla);
		
				
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Tabla 1", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(61, 79, 375, 160);
		panel.add(table);
		
		jButtonMostrarDatos = new JButton("Mostrar datos");
		jButtonMostrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarTabla(e);
				
			}
		});
		jButtonMostrarDatos.setBounds(73, 266, 147, 25);
		panel.add(jButtonMostrarDatos);
		
		
	}
}
