package bucles;

import java.util.Iterator;
import java.util.Scanner;

public class bucles1 {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		
//		System.out.println("EJERCICIO 1");
//		
//		for (int i = 1; i < 21; i++) {
//			System.out.print(i + " ");
//				
//		}
		
		
		
		//EJERCICIO 2
//		
//		System.out.println("EJERCICIO 2");
//		
//		for (int i = 0; i < 201; i+=2) {
//			System.out.print(i + " ");
//				
//		}
		
		//EJERCICIO 3
	
//		System.out.println("EJERCICIO 3");
//		
//		for (int i = 0; i < 201; i++) {
//			if (i%2==0) {
//				System.out.print(i + " ");
//			}
//							
//		}
		
		
		
		//EJERCICIO 4
		
//		System.out.println("EJERCICIO 4");
//		
//		Scanner leer = new Scanner(System.in);
//		
//		System.out.println("Dime hasta que número quieres contar");
//		
//		int cont;
//		
//		cont = leer.nextInt();
//			
//		for (int i = 1; i < cont+1; i++) {
//			System.out.print(i + " ");
//			
//		}
		
		
		
		//EJERCICIO 5
		
//		System.out.println("EJERCICIO 5");
//		
//		Scanner leer = new Scanner(System.in);
//		
//		System.out.println("Dime hasta que número quieres contar:");
//		
//		int num;
//		
//		int factorial=1;
//		
//		num = leer.nextInt();
//		
//		for (int i = num; i > 0; i--) {
//			factorial = factorial * i;
//		}
//		System.out.println("El factorial de " + num + " es: " + factorial);
		
		
		
		//EJERCICIO 6
		
//		System.out.println("EJERCICIO 6");
//		
//		Scanner leer = new Scanner(System.in);
//		
//		int cont = 0;
//		
//		for (int i = 1; i < 11; i++) {
//			System.out.println("Dime el numero " + i + ":");
//			
//			int num = leer.nextInt();
//			
//			if (num < 0) {
//				cont = cont + 1;
//			}
//		}
//		
//		
//		if (cont > 0) {
//			System.out.println("Existen numeros negativos.");
//		}else {
//			System.out.println("No existen");
//		}
		
		
		
		//EJERCICIO 7
		
//		System.out.println("EJERCICIO 7");
//		
//		Scanner leer = new Scanner(System.in);
//		
//		int pos = 0;
//		int neg = 0;
//		
//		for (int i = 1; i < 11; i++) {
//			System.out.println("Dime el numero " + i + ":");
//			
//			int num = leer.nextInt();
//			
//			if (num < 0) {
//				neg = neg + 1;
//			}else {
//				pos = pos +1;
//			}
//		}
//		
//		System.out.println("Existen " + pos + " numeros positivos y " + neg + " numeros negativos.");
//		
//		
		
		//EJERCICIO 8
		
		
//		Scanner leer = new Scanner (System.in);
//		
//		int nums;
//		int posi=0;
//		int nega=0;
//		
//		do {
//			System.out.println("Dime numeros hasta que pongas el 0");
//			
//			nums = leer.nextInt();
//			
//			if (nums<0) {
//				nega = nega +1;
//			}else if (nums>0) {
//				posi = posi +1;	
//			}
//					
//					
//					
//		} while (nums != 0);
//		
//		System.out.println("Positivos: " + posi + " --- Negativos: " + nega);
		
		
		//EJERCICIO 9
		
		
//		int result = 0;
//		
//		for (int i = 1; i < 11; i++) {
//			result = result + i;
//			if (i!=10) {
//				System.out.print(i + " + ");
//			}else if (i==10) {
//				
//				System.out.print(i + " = " + result);
//			}
//			
//		}
		
		
		//EJERCICO 11
		
			
//		int sumaPar = 0;
//		int sumaImpar = 0;
//		
//		for (int i = 100; i < 201; i++) {
//			
//			if (i%2==0) {
//				sumaPar = sumaPar + i;
//			}else {
//				sumaImpar = sumaImpar +i;
//			}
//			
//		}
//		System.out.println("Pares: "+ sumaPar +"   Impares:" + sumaImpar);
//		
		
		
		//EJERCICO 12
		
		
//		Scanner leer = new Scanner (System.in);
//		
//		int a;
//		int b;
//		
//		
//		System.out.println("Dime un numero");
//		a = leer.nextInt();
//		
//		
//		System.out.println("Dime ua cuanto lo quieres elevar");
//		b= leer.nextInt();
//		
//		int resultado = a;
//		
//		for (int i = 0; i < b-1; i++) {
//			resultado = resultado * a;
//			
//		}
//		
//		System.out.println(resultado);
		
		
		//EJERCICO 13
		
		
		System.out.println("Piensa un numero del 1 al 100 y dime si es mayor, menor o igual.");
		
		Scanner leer = new Scanner (System.in);
		
		int numAleatorio = (int)(Math.random()*(100-1+1)+1);
			
		System.out.println(numAleatorio);
		
			String con = "";
		
		do {
			
			String contestacion = leer.next();
			
			int numAleatorio1;
			
			switch (contestacion) {
			
			case "mayor":
				numAleatorio1 = (int)(Math.random()*(100-numAleatorio+1)+numAleatorio);
				System.out.println(numAleatorio1);
				
				break;
			case "menor":
				
				numAleatorio1 = (int)(Math.random()*(numAleatorio-1+1)+1);
				System.out.println(numAleatorio1);
							
				break;
							
			case "igual":
				
				break;

			}
			
			
		} while (con == "igual");
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}
	
	

}

