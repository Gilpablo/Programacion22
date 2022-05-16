package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays1Ejercicios {
	
	public static void ejercicio1() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int j = 0; j < vNums.length; j++) {
			System.out.println(vNums[j]);
		}
		
	}
	
	public static void ejercicio2() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int suma = 0;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int j = 0; j < vNums.length; j++) {			
			suma = suma + vNums[j];
		}
		
		System.out.println(suma);
		
		
	}

	public static void ejercicio3() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		int mayor = 0 , menor = vNums[0];
		
		for (int i = 0; i < vNums.length; i++) {
			
			if (vNums[i]>mayor) {
				mayor = vNums[i];
			}
			if (vNums[i]<menor) {
				menor=vNums[i];
			}
		}
		System.out.println("El mayor es el " + mayor + " y el menos es el " + menor);
		
	}

	public static void ejercicio4() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		int num;
		
		int posi = 0 , nega = 0;
		
		int vNums[];
		
		vNums = new int [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextInt();
			
			vNums [i] = num;
		
		}
		
		for (int i = 0; i < vNums.length; i++) {
			
			
			if (vNums[i]>0) {
				posi = posi + vNums[i];
			}
			
			if (vNums[i]<0) {
				nega += vNums[i];
			}
			
		}
		
		System.out.println("Suma positivos : " + posi + " Negativos: " + nega);
		
		
	}

	public static void ejercicio5() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime 4 numeros");
		
		float num;
		
		float suma = 0;
		
		float media = 0;
		
		float vNums[];
		
		vNums = new float [4];
		
		for (int i = 0; i < vNums.length; i++) {
			System.out.println("dime un numero");
			
			num = leer.nextFloat();
			
			vNums [i] = num;
		
		}
		
		for (int i = 0; i < vNums.length; i++) {
			
			suma += vNums[i];
			
		}
		
		media = suma / 4;
		
		System.out.println(media);
		
		
	}

	public static void ejercicio6() {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("dime el numero n");
		
		int n , m;
		
		n = leer.nextInt();
		
		System.out.println("dime el numero m");
		
		m = leer.nextInt();
		
		int array[];
		
		array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= m;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	public static void ejercicio7() {
		
Scanner leer = new Scanner (System.in);
		
		System.out.println("dime el numero p");
		
		int p , q;
		
		p = leer.nextInt();
		
		System.out.println("dime el numero q");
		
		q = leer.nextInt();
		
		int diferencia=0;
		
		int array[];
		
		
		array = new int[diferencia];
		
		if (q>p) {
			diferencia = q - p +1;
						
			for (int i = 0; i < array.length; i++) {
				
				if(array[0] == p ) {
					array[i] = p+1;
					p +=1;
				}else {
					array[i] = p;
					p +=1;
				}
				
			}
			
		}else if (q<p) {
			diferencia = p - q +1;
			
			for (int i = 0; i < array.length; i++) {
				
				if(array[0] == q ) {
					array[i] = q+1;
					q +=1;
				}else {
					array[i] = q;
					q +=1;
				}
				
			}
			
			
		}
	
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}
	
	
	
	
	
	

}
