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
	    
	    table.setValueAt(numbers[0], 1, 1);
	    
//	    for (int i = 0; i < 9; i++) {
//	    	table.setValueAt(numbers[i], fila, columna+cont2);
//	    	cont2 =+ 1;
//		}
	    
	
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
//				{numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8] ,numbers[9]},
//				{numbers[10], numbers[11], numbers[12], numbers[13], numbers[14], numbers[15], numbers[16], numbers[17], numbers[18] ,numbers[19]},
//				{numbers[20], numbers[21], numbers[22], numbers[23], numbers[24], numbers[25], numbers[26], numbers[27], numbers[28] ,numbers[29]},
//				{numbers[30], numbers[31], numbers[32], numbers[33], numbers[34], numbers[35], numbers[36], numbers[37], numbers[38] ,numbers[39]},
//				{numbers[40], numbers[41], numbers[42], numbers[43], numbers[44], numbers[45], numbers[46], numbers[47], numbers[48] ,numbers[49]},
//				{numbers[50], numbers[51], numbers[52], numbers[53], numbers[54], numbers[55], numbers[56], numbers[57], numbers[58] ,numbers[59]},
//				{numbers[60], numbers[61], numbers[62], numbers[63], numbers[64], numbers[65], numbers[66], numbers[67], numbers[68] ,numbers[69]},
//				{numbers[70], numbers[71], numbers[72], numbers[73], numbers[74], numbers[75], numbers[76], numbers[77], numbers[78] ,numbers[79]},
//				{numbers[80], numbers[81], numbers[82], numbers[83], numbers[84], numbers[85], numbers[86], numbers[87], numbers[88] ,numbers[89]},
//				{numbers[90], numbers[91], numbers[92], numbers[93], numbers[94], numbers[95], numbers[96], numbers[97], numbers[98] ,numbers[99]},
			},
			new String[] {
				"Tabla 1", "Tabla 2 ", "Tabla 3", "Tabla 4", "Tabla 5", "Tabla 6", "Tabla 7", "Tabla 8", "Tabla 9", "Tabla 10"
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
