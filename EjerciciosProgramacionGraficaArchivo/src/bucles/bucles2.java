package bucles;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class bucles2 {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		
//		
//		Scanner leer = new Scanner (System.in);
//		
//		System.out.println("Introduce un número y te dire cuantos multiplos de 3 hay");
//		
//		int num = leer.nextInt();
//		
//		int cont = 0;
//		
//		if (num%3==0) {
//			do {
//				num = num - 3;
//				
//				cont = cont + 1;
//			} while (num!=0);
//		}else {
//			num = num -1 ;
//			
//			if (num%3==0) {
//				do {
//					num = num - 3;
//					
//					cont = cont + 1;
//				} while (num!=0);
//				
//			}else {
//		
//				num = num - 1 ;
//				
//				if (num%3==0) {
//					do {
//						num = num - 3;
//						
//						cont = cont + 1;
//					} while (num!=0);
//				
//				}		
//	
//			}
//	
//		}
//		
//		System.out.println("Cantidad de multiplos de 3:" + cont);
//		
//		
		
		//EJERCICIO 2
		
		System.out.println("Dime un número entero positivo y te dire si es primo o no.");
		
		Scanner leer = new Scanner (System.in);
		int n;
		boolean primo = false;
		n = leer.nextInt();
		
		int contador = 0;
		for(int i = n; i > 0; i--){
		    if(n % i == 0 ){
		        contador++;
		    }
		}
		if(contador == 2){
		    primo = true;
		}
		
		
		if (primo == true) {
			System.out.println("es primo");
		}else if (primo == false) {
			System.out.println("no es primo");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
